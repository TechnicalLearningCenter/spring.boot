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

    public Book getBookByNameAndType(String name,String type){
        return employeeRepo.findByNameAndType(name,type).orElseGet(() -> new Book("temp","temp"));
    }

    public Book getBookByNameOrType(String name, String type) {
        return employeeRepo.findBookByNameOrType(name,type);
    }

    public Book findBookByTypeWhichContains(String type) {
        return employeeRepo.findBookByTypeContaining("Dealer");
    }

    public Book getBookByIdAfter(Integer id) {
        return employeeRepo.findBookByIdAfter(id);
    }
}
