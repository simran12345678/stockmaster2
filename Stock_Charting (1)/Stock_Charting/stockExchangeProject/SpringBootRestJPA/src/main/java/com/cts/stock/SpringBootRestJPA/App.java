package com.cts.stock.SpringBootRestJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.cts.*")
@EntityScan(basePackages="com.cts.stock.entity")
public class App 
{
    public static void main( String[] args )
    {
     SpringApplication.run(App.class, args);
    }
}
