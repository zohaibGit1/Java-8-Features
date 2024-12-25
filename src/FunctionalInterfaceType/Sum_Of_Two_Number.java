package FunctionalInterfaceType;

import java.util.function.BiFunction;

public class Sum_Of_Two_Number {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (a ,b) -> (a + b);
        System.out.println(biFunction.apply(1,2));
        System.out.println(biFunction.apply(1,4));
        System.out.println(biFunction.apply(1,5));
    }
}
