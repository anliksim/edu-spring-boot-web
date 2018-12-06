package edu.boot;

import edu.boot.controller.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring boot application but without the component scanning.
 * Scanning component of the base package can be handy but most of the time you end up in a mess.
 *
 * @see org.springframework.boot.autoconfigure.SpringBootApplication
 * @see org.springframework.context.annotation.ComponentScan
 */
@Configuration
@EnableAutoConfiguration
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public HelloWorldController helloWorldController() {
        return new HelloWorldController();
    }
}
