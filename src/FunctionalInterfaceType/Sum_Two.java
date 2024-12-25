package FunctionalInterfaceType;

import java.util.function.BiFunction;

public class Sum_Two {
    public static void main(String[] args) {

    BiFunction<Integer, Integer, Integer> biFunction =  (i ,j) -> i + j;
        System.out.println(biFunction.apply(1,2));
        System.out.println(biFunction.apply(7,2));
        System.out.println(biFunction.apply(9,2));
    }
}
