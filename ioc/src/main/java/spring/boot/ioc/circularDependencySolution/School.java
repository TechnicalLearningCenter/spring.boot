package spring.boot.ioc.circularDependencySolution;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class School {
    @Autowired
    private College college;

    public College getCollege() {
        return college;
    }

    public School() {
        System.out.println("School.School");
    }
}
