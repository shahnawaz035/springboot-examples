package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ProjectConfig {

    @Bean(name="fordEscape")
    public Vehicle vehicle(){
        Vehicle vehicle=  new Vehicle();
        vehicle.setName("Ford Escape");
        return vehicle;
    }

    @Bean(name="toyotaRav4")
    public Vehicle vehicle1(){
        Vehicle vehicle=  new Vehicle();
        vehicle.setName("Toyota Rav4");
        return vehicle;
    }

    @Bean(name="hyundaiSantafe")
    public Vehicle vehicle3(){
        Vehicle vehicle=  new Vehicle();
        vehicle.setName("Hyundai Santafe");
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
