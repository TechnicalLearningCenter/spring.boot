package spring.boot.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.boot.ioc.component.HelloComponenetImpl;

/**
 * Created by pankaj on 2/14/2017.
 */
public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean(HelloComponenetImpl.class).getName());

    }
}
