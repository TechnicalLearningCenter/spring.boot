package spring.boot.transaction.propgratoin.required.controller;

import spring.boot.transaction.propgratoin.required.domain.Customer;
import spring.boot.transaction.propgratoin.required.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 6/3/2017.
 */

@Component
public class CustomerController {
    @Autowired
    private UserService userService;
    public void saveCustomer(Customer customer){
        userService.saveUser(customer);
    }
}
