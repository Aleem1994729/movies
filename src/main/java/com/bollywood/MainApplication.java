package com.bollywood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication

@ComponentScan(basePackages = {"com.bollywood"})
    @EntityScan("com.bollywood.model")
    @EnableJpaRepositories("com.bollywood.repo")
    @EnableAutoConfiguration
    public class MainApplication {
        //private static final Logger log = LoggerFactory.getLogger(MainApplication.class);

        public static void main(String[] args) {
            SpringApplication.run(MainApplication.class, args);
        }
    }

