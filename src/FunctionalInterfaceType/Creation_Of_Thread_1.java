package FunctionalInterfaceType;

public class Creation_Of_Thread_1 implements Runnable{
    public static void main(String[] args) throws InterruptedException {

        Creation_Of_Thread_1 creationOfThread1 = new Creation_Of_Thread_1();
        Thread thread = new Thread(creationOfThread1);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; ++i) {
            System.out.println(i);
        }
    }
}
