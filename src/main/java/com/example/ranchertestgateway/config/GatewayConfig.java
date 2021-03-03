package com.example.ranchertestgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
public class GatewayConfig {

    private final GatewayRoutingProperties gatewayRoutingProperties;

    public GatewayConfig(GatewayRoutingProperties gatewayRoutingProperties) {
        this.gatewayRoutingProperties = gatewayRoutingProperties;
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {

        return builder.routes()
                .route("web", r -> r.method(HttpMethod.GET).uri(gatewayRoutingProperties.getWebUrl()))
                .build();
    }
}
