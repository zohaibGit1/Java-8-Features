package FunctionalInterfaceType;

import java.util.function.BiFunction;

public class Multiplication_of_Two {
    public static void main(String[] args) {

    BiFunction<Integer, Integer, Integer> mul = (i , j) -> ( i  * j);
        System.out.println(mul.apply(4,4));
        System.out.println(mul.apply(4,9));
        System.out.println(mul.apply(4,1));
        System.out.println(mul.apply(4,5));
    }
}
