package com.example.ranchertestgateway.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "gateway")
public class GatewayRoutingProperties {

    private String webUrl;
}
