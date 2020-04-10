package spring.boot.profileSpecificProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 4/8/2020.
 */
@Component
public class ProfileBasedValueReaderService {
    public ProfileBasedValueReaderService(@Value("${mysql.db.user}") String user) {
        System.out.println(user);
    }
}
