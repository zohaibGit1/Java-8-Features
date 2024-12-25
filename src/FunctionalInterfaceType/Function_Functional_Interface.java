package FunctionalInterfaceType;

import java.awt.*;
import java.util.function.Function;

public class Function_Functional_Interface {
    public static void main(String[] args) {

        Function<String, Integer> f = (name) -> name.length();
        System.out.println(f.apply("Zohaib"));
        System.out.println(f.apply("Anwar"));

        System.out.println(f.apply("Dark"));

    }
}
