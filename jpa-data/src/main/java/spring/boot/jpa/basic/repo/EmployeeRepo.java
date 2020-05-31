package spring.boot.jpa.basic.repo;

import org.springframework.data.repository.CrudRepository;
import spring.boot.jpa.basic.model.Book;

import java.util.List;

/**
 * Created by pankaj on 5/30/2020.
 */
public interface EmployeeRepo extends CrudRepository<Book,Long> {
    List<Book> findByName(String name);

}
