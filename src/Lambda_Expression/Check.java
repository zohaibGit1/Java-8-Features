package Lambda_Expression;


import java.util.function.Predicate;

public class Check {
    public static void main(String[] args) {
        String[] names = {"Alice", "Alex", "Zohaib", "Soul", "Dark",};

        Predicate<String> predicate = name -> name.charAt(0) == 'A';

        for (String name : names) {
            if (predicate.test(name)){
                System.out.println(name);
            }
        }
    }
}
