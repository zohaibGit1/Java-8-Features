package FunctionalInterfaceType;

import Lambda_Expression.MyInterfaceTwo;

interface MyInterface2 {
    void m1();
}

public class Method_Reference_Instance_Method {

    public void loop() {
        for (int i = 0; i < 20; i++) {
            System.out.println( i * i);
        }
    }
    public static void main(String[] args) {
        Method_Reference_Instance_Method methodReferenceInstanceMethod = new Method_Reference_Instance_Method();

        Runnable runnable = methodReferenceInstanceMethod::loop;
        Thread thread = new Thread(runnable);
        thread.start();

    }
}
