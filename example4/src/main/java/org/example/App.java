package org.example;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

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

        Person person = applicationContext.getBean(Person.class);
        Vehicle vehicle = person.getVehicle();
        System.out.println("primary vehicle:" +vehicle.getName());


        Map<String, Vehicle> veh = applicationContext.getBeansOfType(Vehicle.class);
        for (Map.Entry<String, Vehicle> v:veh.entrySet()) {
            System.out.println("Vehicle " + v.getKey() +"  - "+ v.getValue());
        }
        applicationContext.close();

    }

    @Bean
    @Qualifier("ford")
    public Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Ford Escape");
        return vehicle;
    }

    @Bean
    @Qualifier("toyota")
    public Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota Rav4");
        return vehicle;
    }

    @Bean
    @Qualifier("hyundai")
    public Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Hyundai Santafe");
        return vehicle;
    }
}
