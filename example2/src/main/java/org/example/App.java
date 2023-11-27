package org.example;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = applicationContext.getBean(Vehicle.class);
        System.out.println("primary vehicle:" +vehicle.getName());

        Map<String, Vehicle> veh = applicationContext.getBeansOfType(Vehicle.class);
        for (Vehicle v:veh.values()) {
            System.out.println("Vehicle " + v.getName());
        }

    }
}
