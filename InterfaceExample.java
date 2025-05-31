// Methods are public and abstract by default.
// Variables are public, static, and final.
// Supports multiple inheritance (a class can implement multiple interfaces).
// Cannot have constructors.
// Use when you want to define a contract that multiple classes should follow.


interface Fuelable {
    void refuel();
}

class Truck extends Vehicle implements Fuelable {
    Truck(int speed) {
        super(speed);
    }

    void startEngine() {
        System.out.println("Truck engine started at " + speed + " km/h.");
    }

    public void refuel() {
        System.out.println("Truck is being refueled.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Car car = new Car(100);
        car.startEngine();
        car.stopEngine();

        Truck truck = new Truck(80);
        truck.startEngine();
        truck.refuel();
        truck.stopEngine();
    }
}