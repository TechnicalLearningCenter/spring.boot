package spring.boot.transaction.isolation.readuncommited.service;

import spring.boot.transaction.isolation.readuncommited.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pankaj on 6/3/2017.
 */

@Service
public class UserService {

    @Autowired
    private CustomerService customerService;

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void saveUser(Customer customer) {
        customerService.saveCustomer(customer);
    }

    public Customer getCustomer(String customerName) {
        return customerService.getCustomer(customerName);
    }

    public void update(Customer customer1) {
        customerService.update(customer1);
    }
}
