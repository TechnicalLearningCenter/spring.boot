package spring.boot.jpa.basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.jpa.basic.model.Book;
import spring.boot.jpa.basic.repo.EmployeeRepo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pankaj on 5/30/2020.
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public void saveEmployee(Book book){
        employeeRepo.save(book);
    }

    public List<Book> getAllEmployee() {
        List<Book> books = new ArrayList<>();
        employeeRepo.findAll().forEach(books::add);
        return  books;

    }

}
