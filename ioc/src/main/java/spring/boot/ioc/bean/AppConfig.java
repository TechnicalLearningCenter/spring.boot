package spring.boot.ioc.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pankaj on 2/27/2017.
 */
@Configuration
public class AppConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Customer getInfo() {
        System.out.println("Customer.getInfo");
        return new Customer();
    }

    class Customer {

        public void init(){
            System.out.println("Customer.init");
        }

        public void destroy(){
            System.out.println("Customer.destroy");
        }


    }

}
