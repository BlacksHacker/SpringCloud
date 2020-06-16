package com.shelton.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class ApplicationServer01 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationServer01.class, args);
    }
}
