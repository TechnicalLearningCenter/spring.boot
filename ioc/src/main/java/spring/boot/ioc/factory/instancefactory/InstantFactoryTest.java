package spring.boot.ioc.factory.instancefactory;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstantFactoryTest {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("/spring/boot/ioc/factory/instancefactory/applicationContext.xml");
    }
}

