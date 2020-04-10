package spring.boot.placeholderInPropertiesFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 4/8/2020.
 */
@Component
public class PlaceHolderValueReaderService {
    public PlaceHolderValueReaderService(@Value("${mysql.db.user}") String user) {
        System.out.println(user);
    }
}
