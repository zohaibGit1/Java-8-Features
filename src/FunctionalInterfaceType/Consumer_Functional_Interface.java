package FunctionalInterfaceType;

import javax.naming.Name;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Functional_Interface {
    public static void main(String[] args) {



     Consumer<String> consumer = (name) -> System.out.println(name + " , Good evening bro");
     consumer.accept("Hello");
     consumer.accept("Hi");
     consumer.accept("Hey");


     // ForEach Method is the part of the collection
     List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

     list.forEach(i -> System.out.print(i +  " "));

















        //        List<Integer> list = Arrays.asList(10, 20, 30, 40);
//
//        for (int i = 0; i < list.size(); ++i)
//        {
//            System.out.println(list.get(i));
//        }

//        for (Integer number : list) {
//            System.out.print(number + " ");
//        }
    }
}
