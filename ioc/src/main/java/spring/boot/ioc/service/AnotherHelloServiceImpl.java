package spring.boot.ioc.service;

import org.springframework.stereotype.Service;

/**
 * Created by pankaj on 2/14/2017.
 */

@Service
public class AnotherHelloServiceImpl implements HelloService {

    public AnotherHelloServiceImpl() {
        System.out.println("AnotherHelloServiceImpl Default Constructor");
    }

    @Override
    public String toString() {
        return "AnotherHelloServiceImpl";
    }
}
