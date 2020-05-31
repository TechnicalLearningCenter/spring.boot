package spring.boot.jpa.basic.repo;

import org.springframework.data.repository.CrudRepository;
import spring.boot.jpa.basic.model.Book;

import java.util.List;
import java.util.Optional;

/**
 * Created by pankaj on 5/30/2020.
 */
public interface EmployeeRepo extends CrudRepository<Book, Long> {
    List<Book> findByName(String name);
    Optional<Book> findByNameAndType(String name, String type);
    Optional<Book> findByNameOrType(String name, String type);

    Book findBookByNameOrType(String name, String type);

    Book findBookByTypeContaining(String type);

    Book findBookByIdAfter(Integer id);
}
