package spring.boot.ioc.autowireMap;



import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Dealer implements User {

    @Override
    public String toString() {
        return "Dealer{}";
    }

    public Dealer() {
        System.out.println("Dealer.Dealer");
    }
}