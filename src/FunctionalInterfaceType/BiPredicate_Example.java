package FunctionalInterfaceType;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicate_Example {
    public static void main(String[] args) {

        BiPredicate<Integer,Integer> bipredicate = (i, j) -> (i + j) >= 20;
        System.out.println(bipredicate.test(3,4));
        System.out.println(bipredicate.test(3,18));
    }
}
