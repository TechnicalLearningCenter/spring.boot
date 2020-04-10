package spring.boot.readPropertiesFileAsClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 4/8/2020.
 */
@Component
public class UserService {

    @Autowired
    public UserService(User user) {
        System.out.println(user.getId());
    }
}
