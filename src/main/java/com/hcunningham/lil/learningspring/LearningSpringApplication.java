package com.hcunningham.lil.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication annotation desigs this file as a config file and start of al component scanning
//also inits auto-configs part of Spring Boot itself
@SpringBootApplication
public class LearningSpringApplication {

    //main can be used to run/start the app in the jvm
    public static void main(String[] args) {
        SpringApplication.run(LearningSpringApplication.class, args);
    }

}
