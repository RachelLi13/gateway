package com.javainuse.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Value("${service.one}")
    private String API_1;

    @Value("${service.two}")
    private String API_2;

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/employee/**")
                        .uri(API_1)
                        .id("employeeModule"))

                .route(p -> p
                        .path("/consumer/**")
                        .uri(API_2)
                        .id("consumerModule"))
                .build();
    }

}