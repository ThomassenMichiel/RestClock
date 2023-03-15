package com.thomassenmichiel.restclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RestClockApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestClockApplication.class, args);
    }


}
