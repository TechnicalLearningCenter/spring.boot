package spring.boot.profileSpecificProperties.defaultPropertyReader;

/**
 * Created by pankaj on 10/28/2017.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "spring.boot.profileSpecificProperties.defaultPropertyReader")

public class ReadDefaultPropertyIfProfileNotSet {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(ReadDefaultPropertyIfProfileNotSet.class);
        app.run(args);

    }
}