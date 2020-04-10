package spring.boot.profileSpecificProperties;

/**
 * Created by pankaj on 10/28/2017.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "spring.boot.profileSpecificProperties")

public class ProfileBasedValueReader {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(ProfileBasedValueReader.class);
        args = new String[] {"--spring.profiles.active=dev"};
        app.run(args);

    }
}