package FunctionalInterfaceType;

import Lambda_Expression.MyInterfaceTwo;

interface MyInterface {
    void m1();
}

public class Method_Reference_Static_Method {
    public static void m2() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {


     //   MyInterfaceTwo mi = Method_Reference_Static_Method_1::m2;
      //  mi.m1();
    }
}
