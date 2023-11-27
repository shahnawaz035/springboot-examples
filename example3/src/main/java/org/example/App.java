package org.example;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * Hello world!
 *
 */
//@Configuration
@ComponentScan
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        Vehicle vehicle = applicationContext.getBean(Vehicle.class);
        System.out.println("primary vehicle:" +vehicle.getName());

        Map<String, Vehicle> veh = applicationContext.getBeansOfType(Vehicle.class);
        for (Vehicle v:veh.values()) {
            System.out.println("Vehicle " + v.getName());
        }
        applicationContext.close();

    }
}
