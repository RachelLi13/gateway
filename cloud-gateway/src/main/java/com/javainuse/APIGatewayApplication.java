package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(APIGatewayApplication.UriConfiguration.class)
public class APIGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(APIGatewayApplication.class, args);
    }

//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r -> r.path("/employee/**")
//                        .uri("http://localhost:8081/")
//                        .id("employeeModule"))
//
//                .route(r -> r.path("/consumer/**")
//                        .uri("http://localhost:8082/")
//                        .id("consumerModule"))
//                .build();
//    }
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder, UriConfiguration uriConfiguration) {
    String httpUri = uriConfiguration.getHttpbin();
    return builder.routes()
            .route(p -> p
                    .path("/get")
                    .filters(f -> f.addRequestHeader("Hello", "World"))
                    .uri(httpUri))
            .build();
    }

    @ConfigurationProperties
    class UriConfiguration {

        private String httpbin = "http://httpbin.org:80";

        public String getHttpbin() {
            return httpbin;
        }

        public void setHttpbin(String httpbin) {
            this.httpbin = httpbin;
        }
    }
}
