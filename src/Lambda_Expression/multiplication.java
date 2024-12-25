package Lambda_Expression;

public class multiplication {
    public static void main(String[] args) {
        Multiply multiply = (a, b) -> a * b;
        System.out.println(multiply.mul(2,3));
    }
}
