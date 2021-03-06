package spring.boot.transaction.isolation.readcommited;

import spring.boot.transaction.isolation.readcommited.controller.CustomerController;
import spring.boot.transaction.isolation.readcommited.domain.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pankaj on 2/14/2017.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerController controller = context.getBean(CustomerController.class);
        controller.saveCustomer(new Customer("pankaj", 500));

        Thread thread2 = new Thread(() -> controller.getCustomerByName("pankaj"), "Thread 1");
        thread2.start();

        Thread thread1 = new Thread(() -> controller.updateCustomer(new Customer("pankaj", 999)), "Thread 2");
        thread1.sleep(2000);
        thread1.start();

    }

}

