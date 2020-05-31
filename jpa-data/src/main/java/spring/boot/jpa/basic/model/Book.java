package spring.boot.jpa.basic.model;

/**
 * Created by pankaj on 5/30/2020.
 */


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Book implements Serializable{

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Book() {
    }

    public Book(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}