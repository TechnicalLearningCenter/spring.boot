package spring.boot.ioc.dependson;

import org.springframework.stereotype.Repository;

/**
 * Created by pankaj on 10/26/2017.
 */
@Repository
public class CustomerRepo {

    public CustomerRepo() {
        System.out.println("GenericRepo.GenericRepo");
    }
}
