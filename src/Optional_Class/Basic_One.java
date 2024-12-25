package Optional_Class;

import java.util.Scanner;

class User {
    public String getUserName(int id) {
        // returning the data directly..
        if (id == 100) {
            return "Zohaib";
        } else if (id == 101) {
            return "Anwar";
        }else if (id == 102) {
            return "Dark";
        }
        return null;
    }
}

public class Basic_One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userId = sc.nextInt();

        User user = new User();
        String userName = user.getUserName(userId);
        System.out.println(userName.toUpperCase());
    }
}
