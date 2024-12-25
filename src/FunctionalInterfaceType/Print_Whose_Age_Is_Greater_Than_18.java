package FunctionalInterfaceType;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
    public int age;
    public String name;

    Person(int age,String name) {
        this.age = age;
        this.name = name;
    }
}

public class Print_Whose_Age_Is_Greater_Than_18 {
    public static void main(String[] args) {
        Person p1 = new Person(13,"Dark");
        Person p2 = new Person(19,"Zohaib");
        Person p3 = new Person(17,"Soul");
        Person p4 = new Person(22,"Anwar");
        Person p5 = new Person(45,"Viper");
        Person p6 = new Person(36,"BMW");

        List<Person> list = Arrays.asList(p1, p2, p3, p4, p5, p6);
        Predicate<Person> predicate = p -> p.age >= 18;

        for (Person person : list){
            if (predicate.test(person)){
                System.out.println(person.age + " " + person.name);
            }
        }
    }
}
