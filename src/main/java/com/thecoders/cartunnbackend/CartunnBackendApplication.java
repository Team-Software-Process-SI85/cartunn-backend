package com.thecoders.cartunnbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CartunnBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CartunnBackendApplication.class, args);
    }

}
