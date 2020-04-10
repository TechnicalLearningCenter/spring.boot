package spring.boot.ioc.factory.staticfacoty;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactoryTest {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("/spring/boot/ioc/factory/staticfacoty/applicationContext.xml");
    }
}

