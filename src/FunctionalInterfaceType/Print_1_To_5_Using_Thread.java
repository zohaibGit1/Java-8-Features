package FunctionalInterfaceType;

public class Print_1_To_5_Using_Thread implements Runnable
{
    @Override
    public void run() {
        for (int i = 0 ; i < 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Print_1_To_5_Using_Thread print1To5UsingThread = new Print_1_To_5_Using_Thread();
        Thread thread = new Thread(print1To5UsingThread);
        thread.start();
    }
}
