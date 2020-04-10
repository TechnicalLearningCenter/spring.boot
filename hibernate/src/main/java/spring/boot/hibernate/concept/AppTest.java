package spring.boot.hibernate.concept;

import spring.boot.hibernate.concept.config.AppConfig;
import spring.boot.hibernate.concept.domain.Employee;
import spring.boot.hibernate.concept.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pankaj on 7/15/2017.
 */
public class AppTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService bean = annotationConfigApplicationContext.getBean(EmployeeService.class);
        bean.saveEmployeeDetail();
        Employee employeeById = bean.getEmployeeById(2);
    }
}
