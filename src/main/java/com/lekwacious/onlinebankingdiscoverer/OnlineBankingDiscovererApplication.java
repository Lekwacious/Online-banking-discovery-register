package com.lekwacious.onlinebankingdiscoverer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlineBankingDiscovererApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineBankingDiscovererApplication.class, args);
    }

}
