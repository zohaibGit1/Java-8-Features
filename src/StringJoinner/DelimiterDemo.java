package StringJoinner;

import java.util.StringJoiner;

public class DelimiterDemo {
    public static void main(String[] args) {

        /*
        StringJoiner stringJoiner = new StringJoiner("-");
        stringJoiner.add("A");
        stringJoiner.add("B");
        System.out.println(stringJoiner);
        */

        StringJoiner stringJoiner = new StringJoiner("-","[","]");
        stringJoiner.add("Zohaib");
        stringJoiner.add("Anwar");
        stringJoiner.add("Dark");
        stringJoiner.add("Soul");
        System.out.println(stringJoiner);
    }
}
