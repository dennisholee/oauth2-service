package com.forest.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by dennislee on 1/10/16.
 */

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class AuthServerApplication {

    public static void main(String args[]) {
        SpringApplication.run(AuthServerApplication.class, args);
    }


}
