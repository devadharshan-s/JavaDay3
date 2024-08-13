public class Vehicle {
    int speed;
    int fuelCapacity;

    Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public static void main(String[] args) {
        Car car = new Car(200,50,4);
        System.out.println("Car\n Max Speed: " + car.speed + " Fuel Capacity: " + car.fuelCapacity + " Doors: " + car.numDoors);
        Motorcycle m = new Motorcycle(150,15,true);
        System.out.println("Motorcycle\n MaxSpeed: " + m.speed + " Fuel Capacity: " + m.fuelCapacity + " Sidecar: " + m.hasSideCar);
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(int speed, int fuelCapacity, int numDoors) {
        super(speed, fuelCapacity);
        this.numDoors = numDoors;
    }
}

class Motorcycle extends Vehicle {
    boolean hasSideCar;
    Motorcycle(int speed, int fuelCapacity, boolean hasSideCar) {
        super(speed, fuelCapacity);
        this.hasSideCar = true;
    }
}