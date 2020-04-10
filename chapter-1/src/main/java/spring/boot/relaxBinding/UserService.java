package spring.boot.relaxBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 4/8/2020.
 */
@Component
public class UserService {

    @Autowired
    public UserService(User user) {
        System.out.println(user.getAddressOne());
        System.out.println(user.getAddressTwo());
        System.out.println(user.getAddressThree());
    }
}
