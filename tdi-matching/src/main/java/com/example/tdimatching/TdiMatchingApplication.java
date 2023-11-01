package com.example.tdimatching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.tdimatching","com.example.tdiframework"})
public class TdiMatchingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TdiMatchingApplication.class, args);
    }

}
