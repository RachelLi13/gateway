//package com.javainuse.config;
//
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Map;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.javainuse.APIGatewayApplication;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import java.time.Duration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.web.server.LocalServerPort;
////import org.springframework.cloud.client.DefaultServiceInstance;
////import org.springframework.cloud.gateway.config.GatewayMetricsProperties;
////import org.springframework.cloud.gateway.test.HttpBinCompatibleController;
////import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
////import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
////import org.springframework.cloud.loadbalancer.support.ServiceInstanceListSuppliers;
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.context.annotation.Import;
////import org.springframework.core.env.Environment;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.reactive.server.WebTestClient;
//import org.springframework.util.SocketUtils;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {APIGatewayApplication.class}, webEnvironment = RANDOM_PORT,
//    properties = "management.server.port=${test.port}")
//
//public class SpringCloudConfigTest{
//
//    protected static int managementPort;
//
//
//    @LocalServerPort
//    protected int port = 0;
//
//    protected WebTestClient webClient;
//
//    protected String baseUri;
//
//    @BeforeClass
//    public static void beforeClass(){
//        managementPort=SocketUtils.findAvailableTcpPort();
//
//        System.setProperty("test.port", String.valueOf(managementPort));
//    }
//
//    @AfterClass
//    public static void afterClass() {
//        System.clearProperty("test.port");
//    }
//
//    @Before
//    public void setup(){
//        baseUri = "http://localhost:" + port;
//        this.webClient = WebTestClient.bindToServer().responseTimeout(Duration.ofSeconds(10)).baseUrl(baseUri).build();
//    }
//
//    @Test
//    public void contextLoads() {
//        webClient.get().uri("/employee/message").exchange().expectStatus().isOk();
//    }
//
//}
//
//
