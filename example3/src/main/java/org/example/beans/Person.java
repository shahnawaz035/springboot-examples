package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private final String name = "Shah";
    private final Vehicle vehicle;

    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
