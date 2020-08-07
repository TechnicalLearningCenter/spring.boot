package spring.boot.lombok;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 4/8/2020.
 */

@RequiredArgsConstructor
@Data
@Component
public class User {

    private String addressOne = "addressOne";
    private String addressTwo="addressTwo";
    private String addressThree="addressThree";
}
