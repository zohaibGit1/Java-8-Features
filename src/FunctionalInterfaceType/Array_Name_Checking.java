package FunctionalInterfaceType;

import java.util.function.Predicate;

public class Array_Name_Checking {
    public static void main(String[] args) {

        String names[] = {"Anya","Artik","jbdaj","sdugsdjk","Akaksa"};

        Predicate<String> predicate = name ->  name.charAt(name.length() - 1)  == 'a';
        for (String Na: names){
            if (predicate.test(Na)){
                System.out.println(Na);
            }
        }
    }
}
