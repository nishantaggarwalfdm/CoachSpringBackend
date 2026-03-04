package com.fdmgroup.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class ConfigCls {
	 @Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/**")
	                    .allowedOrigins(
	                        "http://localhost:3000",
	                        "https://coach-frontend-419807603191.northamerica-northeast1.run.app",
	                        "https://coach-frontend-419807603191.northamerica-northeast1.run.app"
	                    )
	                    .allowedMethods("*")
	                    .allowedHeaders("*")
	                    .allowCredentials(false);
	            }
	        };
	    }

}
