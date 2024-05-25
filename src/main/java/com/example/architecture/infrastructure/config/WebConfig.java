package com.example.architecture.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Configure the URL pattern for which CORS should be allowed
                .allowedOrigins("http://127.0.0.1:5500") // Allow requests from this origin
                .allowedMethods("GET", "POST", "PUT", "DELETE"); // Allow these HTTP methods
    }
}