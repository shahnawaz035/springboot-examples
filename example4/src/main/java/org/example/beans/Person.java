package org.example.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private final String name = "Shah";
    private final Vehicle vehicle;

    public Person( Vehicle vehicle2) {
        this.vehicle = vehicle2;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
