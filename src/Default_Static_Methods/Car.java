package Default_Static_Methods;

interface Vehicle {
    void start();

    default void clean() {
        System.out.println("Cleaning the car......");
    }

    default int result() {
        return 1000;
    }

    static void  modifying() {
        System.out.println("Modifying the Car...........");
    }
}
//        One class cannot extends two interface
//
//interface Air {
//
//}

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car is Starting......");
    }


    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.clean();
        int result = car.result();
        System.out.println(result);
        Vehicle.modifying();
    }
}
