package com.oriole.motaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MotaclientApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MotaclientApplication.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(MotaclientApplication.class);
        builder.headless(false).run(args);
    }

}
