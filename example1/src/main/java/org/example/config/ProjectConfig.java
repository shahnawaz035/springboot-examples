package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;

public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle=  new Vehicle();
        vehicle.setName("Ford Escape");
        return vehicle;
    }



    @Bean
    public String hello(){
        return "hello";
    }

    @Bean
    public Integer number16(){
        return 16;
    }
}
