// Abstract Class Example
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key.");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
    }
}
