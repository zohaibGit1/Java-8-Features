package FunctionalInterfaceType;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    String name;
    String location;
    String dept;

    public Employee(String name, String location, String dept) {
        this.name = name;
        this.location = location;
        this.dept = dept;
    }
}

public class Print_Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ashok","Kanpur","Networking");
        Employee e2 = new Employee("Zohaib","Lucknow","DevOps");
        Employee e3 = new Employee("Anwar","Hyd","Database");
        Employee e4 = new Employee("Soul","UK","Java Full Stack");

        List<Employee> list = Arrays.asList(e1, e2, e3, e4);
        Predicate<Employee> predicate1 = e -> e.location.equals("Hyd");
        Predicate<Employee> predicate2 = e -> e.dept.equals("Database");
        Predicate<Employee> predicate3 = e -> e.name.equals("Anwar");
        // Predicate Joining

        Predicate<Employee> predicate = predicate1.and(predicate2).and(predicate3);
        for (Employee employee : list) {
            if (predicate.test(employee))
                System.out.println(employee.name + " " + employee.dept + " " + employee.location);
        }
    }
}
