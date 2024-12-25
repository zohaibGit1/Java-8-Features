package Optional_Class;

import java.util.Scanner;

class User2 {
    public String getUserName(int id) {
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

public class Second_Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userId = sc.nextInt();

        User2 user = new User2();
            String userName = user.getUserName(userId);
            // Checking for the null values...
            if (userName != null) {
            System.out.println(userName.toUpperCase());
        }else{
                System.out.println("Not Found");
            }
    }
}
