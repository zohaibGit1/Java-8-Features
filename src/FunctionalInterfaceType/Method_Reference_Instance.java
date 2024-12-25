package FunctionalInterfaceType;

import java.util.function.BiFunction;

@FunctionalInterface
interface Reference {
    int m2(int a, int b);
   // void add();
}

public class Method_Reference_Instance {

    public int sum(int a, int b)  {
        return a + b;
    }
//    public int sum(int a, int b) {
//        return a + b;
//    }
//    public static void main(String[] args) {
//        Method_Reference_Instance methodReferenceInstance = new  Method_Reference_Instance();
//        Reference re  = methodReferenceInstance::sum;
//        int result = re.m2(1,2);
//        System.out.println(result);
public static void main(String[] args) {

//    BiFunction<Integer, Integer,Integer> biFunction = (a, b) -> a + b;
//    System.out.println(biFunction.apply(1,2));
//    }
        Method_Reference_Instance methodReferenceInstance = new Method_Reference_Instance();
//    int sum = methodReferenceInstance.sum(1, 2);
//    System.out.println(sum);

    Reference re = methodReferenceInstance::sum;
    System.out.println(re.m2(1,9));

}
}
