package FunctionalInterfaceType;

public class Creation_Of_Thread_2 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 11; ++i) {
                    System.out.println(i);
                }
            }
        };

        Thread thread = new Thread (runnable);
        thread.start();
    }
}
