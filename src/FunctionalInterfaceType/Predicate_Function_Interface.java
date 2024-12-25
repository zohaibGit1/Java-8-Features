package FunctionalInterfaceType;

import java.util.function.Predicate;

public class Predicate_Function_Interface {
    public static void main(String[] args) {
       Predicate<Integer> predicate =  i -> i >  10;
        boolean test = predicate.test(11);
        System.out.println(test);
    }
}


















//  Normal Function
//public static boolean test(int i) {
//    if (i > 10){
//        return true;
//    }else {
//        return false;
//    }
//}
//
//public static void main(String[] args) {
//    System.out.println(test(3));
//}