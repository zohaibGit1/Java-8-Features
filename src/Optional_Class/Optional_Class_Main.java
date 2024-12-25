package Optional_Class;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class car {
    public Optional<String> getCarName(int id) {
        // With Optional Object
        String name = null;
        if (id == 1) {
            name = "First Car";
        } else if (id == 2) {
            name = "Second Car";
        }
        return Optional.ofNullable(name);
    }
}


public class Optional_Class_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        car c = new car();
        Optional<String> carName = c.getCarName(i);
        // Line 26   is getting the optional object
        if (carName.isPresent()) {
            String s = carName.get();
            System.out.println(s.toUpperCase());
        }else {
            System.out.println("Not Present");
        }
    }
}
