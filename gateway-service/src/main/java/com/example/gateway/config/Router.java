package com.example.gateway.config;

import lombok.AllArgsConstructor;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class Router {
    private final GatewayFilter clientFilter;
    private final GatewayFilter bookFilter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("client", r -> r.path("/api/client/**")
                        .filters(f -> f.filter(clientFilter))
                        .uri("lb://CLIENT-SERVICE"))
                .route("book-header-test", r -> r.path("/api/books/test")
                        .filters(f -> f.filter(bookFilter))
                        .uri("lb://BOOK-SERVICE"))
                .build();
    }
}
