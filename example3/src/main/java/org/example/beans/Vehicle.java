package org.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name = "ford escape";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init(){
        System.out.println("creating beans");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("deleting beans");
    }
}
