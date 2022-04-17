package com.pkgarg.movierecommendationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieRecommendationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieRecommendationServiceApplication.class, args);
    }

}
