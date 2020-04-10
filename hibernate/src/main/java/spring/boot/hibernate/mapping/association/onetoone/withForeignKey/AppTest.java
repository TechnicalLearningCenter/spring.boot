package spring.boot.hibernate.mapping.association.onetoone.withForeignKey;

import spring.boot.hibernate.mapping.association.onetoone.withForeignKey.config.AppConfig;
import spring.boot.hibernate.mapping.association.onetoone.withForeignKey.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pankaj on 7/15/2017.
 */
public class AppTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService bean = annotationConfigApplicationContext.getBean(EmployeeService.class);
        bean.saveEmployeeDetail();
    }
}
