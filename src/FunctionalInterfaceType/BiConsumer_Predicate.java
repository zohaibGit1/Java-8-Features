package FunctionalInterfaceType;

import java.util.function.BiConsumer;

public class BiConsumer_Predicate {
    public static void main(String[] args) {

        BiConsumer<String, Integer> bi = (name, value) -> System.out.println(name + " " + value);
        bi.accept("Zohaib", 1);
        bi.accept("Zohaib", 1);
        bi.accept("Zohaib", 1);
    }
}
