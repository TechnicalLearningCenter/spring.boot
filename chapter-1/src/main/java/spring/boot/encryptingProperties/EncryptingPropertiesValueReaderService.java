package spring.boot.encryptingProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 4/8/2020.
 */
@Component
public class EncryptingPropertiesValueReaderService implements EnvironmentPostProcessor {
    public EncryptingPropertiesValueReaderService(@Value("${mysql.db.user}") String user) {
        System.out.println(user);
    }

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment configurableEnvironment, SpringApplication springApplication) {
//        mysql.db.user
//        configurableEnvironment.validateRequiredProperties();

    }
}
