package com.smetner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.smetner.model")
@EnableJpaRepositories(basePackages = "com.smetner.repository")
@SpringBootApplication(scanBasePackages = "com.smetner")
public class App
{

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
