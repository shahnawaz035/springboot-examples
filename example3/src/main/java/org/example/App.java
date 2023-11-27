package org.example;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

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

        applicationContext.registerBean("bmwX3", Vehicle.class, ()->{
            Vehicle v = new Vehicle();
            v.setName("BMW Vehicle");
            return v;
        });

        Vehicle vehicle = applicationContext.getBean(Vehicle.class);
        System.out.println("primary vehicle:" +vehicle.getName());


        Map<String, Vehicle> veh = applicationContext.getBeansOfType(Vehicle.class);
        for (Map.Entry<String, Vehicle> v:veh.entrySet()) {
            System.out.println("Vehicle " + v.getKey() +"  - "+ v.getValue());
        }
        applicationContext.close();

    }
}
