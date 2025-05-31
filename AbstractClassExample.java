// Can have abstract and non-abstract methods.
// Can have constructors and instance variables.
// Supports inheritance (only one class can extend it).
// Use when classes share common behavior.

abstract class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    abstract void startEngine(); // abstract method

    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}
class Car extends Vehicle {
    Car(int speed) {
        super(speed);
    }

    void startEngine() {
        System.out.println("Car engine started at " + speed + " km/h.");
    }
}



public class AbstractClassExample {
    public static void main(String[] args) {
        Car myCar = new Car(100);
        myCar.startEngine(); // calling the abstract method implementation
        myCar.stopEngine(); // calling the concrete method
        System.out.println("Speed of the car: " + myCar.speed + " km/h");
    }
}