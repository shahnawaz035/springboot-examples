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

        Vehicle veh = applicationContext.getBean("vehicle", Vehicle.class);
        System.out.println("Vehicle " + veh.getName());


    }
}
