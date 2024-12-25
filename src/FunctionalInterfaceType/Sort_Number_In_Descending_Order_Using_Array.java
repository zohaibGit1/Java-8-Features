package FunctionalInterfaceType;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_Number_In_Descending_Order_Using_Array {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 10, 12, 3, 5);
        list.sort(new Sorting());
        System.out.println(list);

    }
}


class Sorting implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
