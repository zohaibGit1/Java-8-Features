package Lambda_Expression;

public class Lambda_Function_2 {
    public static void main(String[] args) {
        Sum sumFunction = (a, b) -> (a + b);
        System.out.println("Sum  " +sumFunction.sum(1,6) );
    }
}
