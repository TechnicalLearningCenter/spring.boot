package spring.boot.ioc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 5/23/2017.
 */
@Component
public class HelloComponenetImpl {

    @Autowired
    private HelloService helloService;

    public HelloComponenetImpl(){
        System.out.println();
    }

    public String getName(){
        return this.toString();
    }
}
