package FunctionalInterfaceType;

import java.util.List;


public class ForEach_Method_Collections {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 6, 7, 8);
        list.forEach(i -> System.out.print(i + " "));

    }
}
