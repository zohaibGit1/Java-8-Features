package FunctionalInterfaceType;

import java.util.function.Supplier;

public class Supplier_Predicate {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> {
            StringBuilder otp = new StringBuilder(" ");
            for (int i = 1; i <= 10; ++i) {
                otp.append((int) (Math.random() * 10));
            }
            return otp.toString();
        };
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
