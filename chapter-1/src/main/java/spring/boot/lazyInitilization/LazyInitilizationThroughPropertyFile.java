package spring.boot.lazyInitilization;

/**
 * Created by pankaj on 10/28/2017.
 */

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LazyInitilizationThroughPropertyFile {

    public static void main(String[] args) {
        SpringApplication.run(LazyInitilizationThroughPropertyFile.class,args);
//        If you want to disable lazy initialization for certain beans while using lazy initialization
//        for the rest of the application, you can explicitly set their lazy attribute to false using the @Lazy(false) annotation.
//
//
//        Add following entry in application.properties in resources folder
//        To enable provide value as true and to disable provide value as false
//        spring.main.lazy-initialization=true
    }
}