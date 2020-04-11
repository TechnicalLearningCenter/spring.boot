package spring.boot.transaction.propgratoin.required;

import spring.boot.transaction.propgratoin.required.controller.CustomerController;
import spring.boot.transaction.propgratoin.required.domain.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pankaj on 2/14/2017.
 */
public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerController controller = context.getBean(CustomerController.class);
        Customer customer = new Customer();
        customer.setName("pankaj");
        controller.saveCustomer(customer);
        System.out.println(controller);

    }
}
