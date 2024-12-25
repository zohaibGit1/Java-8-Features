package FunctionalInterfaceType;

import java.util.Arrays;
import java.util.List;
public class Comparator_In_Descending_Order_Using_Lambda {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 5, 6, 3);
        // Ascending Order Sorting
       // Collections.sort(list, (o1, o2) -> (o1 > o2) ? 1 : 1);
        list.sort((o1, o2) -> (o1 > o2) ? -1 : 1);
        System.out.println(list);
    }
}

//
//class Sort implements Comparator<Integer> {
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2 - o1;
//    }
//}