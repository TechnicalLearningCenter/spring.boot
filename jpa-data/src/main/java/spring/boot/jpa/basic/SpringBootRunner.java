package spring.boot.jpa.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.boot.jpa.basic.model.Book;
import spring.boot.jpa.basic.service.EmployeeService;

/**
 * Created by pankaj on 5/31/2020.
 */
@SpringBootApplication
public class SpringBootRunner implements CommandLineRunner {

    @Autowired
    private  EmployeeService service;
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("----------------------------------------------start------------------------------------------");

        service.saveEmployee(new Book("pankaj1","Customer"));
        service.saveEmployee(new Book("pankaj2","Customer"));
        service.saveEmployee(new Book("pankaj3","customer"));
        service.saveEmployee(new Book("pankaj4","Customer"));
        service.saveEmployee(new Book("pankaj5","customer"));
        service.saveEmployee(new Book("pankaj6","customer"));
        service.getAllEmployee().forEach(System.out::println);

        System.out.println("----------------------------------------------end------------------------------------------");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRunner.class, args);


    }
}
