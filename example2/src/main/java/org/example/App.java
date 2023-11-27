package org.example;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

        Vehicle veh = applicationContext.getBean("fordEscape", Vehicle.class);
        System.out.println("Vehicle " + veh.getName());

        Vehicle veh1 = applicationContext.getBean("toyotaRav4", Vehicle.class);
        System.out.println("Vehicle " + veh1.getName());

        Vehicle veh2 = applicationContext.getBean("hyundaiSantafe", Vehicle.class);
        System.out.println("Vehicle " + veh2.getName());

    }
}
