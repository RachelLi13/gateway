package com.javainuse.config;



import org.json.simple.parser.ParseException;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;


@Configuration
public class SpringCloudConfig {

//    Object obj;
//
//    {
//        try {
//            obj = new JSONParser().parse(new FileReader("swagger.json"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }
//
//    JSONObject jo = (JSONObject) obj;
//
//    String path = (String) jo.get("paths");


    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/employee/**")
                        .uri("http://localhost:8081/")
                        .id("employeeModule"))

                .route(r -> r.path("/consumer/**")
                        .uri("http://localhost:8082/")
                        .id("consumerModule"))
                .build();
    }

}