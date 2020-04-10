package spring.boot.encryptingProperties;

/**
 * Created by pankaj on 10/28/2017.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "spring.boot.encryptingProperties")

public class EncryptingPropertiesValueReader {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(EncryptingPropertiesValueReader.class);

        args = new String[] {"--spring.profiles.active=dev"};
        app.run(args);

    }
}