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

        service.saveEmployee(new Book("pankaj1","Customer1"));
        service.saveEmployee(new Book("pankaj2","Customer2"));
        service.saveEmployee(new Book("pankaj3","customer3"));
        service.saveEmployee(new Book("pankaj4","Customer4"));
        service.saveEmployee(new Book("pankaj5","customer5"));
        service.saveEmployee(new Book("pankaj6","PermanentDealer"));

//        findAll
//        service.getAllEmployee().forEach(System.out::println);

//        AndCondition
//        System.out.println(service.getBookByNameAndType("pankaj1","Customer"));

//        or Condition
//        System.out.println(service.getBookByNameOrType("pankaj1","anyType"));
//        System.out.println(service.getBookByNameOrType("anyName","Customer1"));

        //TODO: After
        System.out.println(service.getBookByIdAfter(5));
        //TODO: Before

//        Containing
//        System.out.println(service.findBookByTypeWhichContains("Deale"));



        System.out.println("----------------------------------------------end------------------------------------------");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRunner.class, args);


    }
}
