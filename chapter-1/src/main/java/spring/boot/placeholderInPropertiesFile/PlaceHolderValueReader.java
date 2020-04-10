package spring.boot.placeholderInPropertiesFile;

/**
 * Created by pankaj on 10/28/2017.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "spring.boot.placeholderInPropertiesFile")

public class PlaceHolderValueReader {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(PlaceHolderValueReader.class);
        app.run(args);

    }
}