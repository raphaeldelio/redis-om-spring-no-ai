package dev.raphaeldelio.redisomspringnoai;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RedisOmSpringNoAiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisOmSpringNoAiApplication.class, args);
    }

    @Bean
    CommandLineRunner loadData() {
        return args -> {
            System.out.println("Hello, Redis OM Spring!");
        };
    }
}
