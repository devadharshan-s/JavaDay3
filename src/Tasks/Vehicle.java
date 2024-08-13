package Tasks;

public class Vehicle {
    int wheels;
    Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public static void main(String[] args) {
        Car c = new Car(4,"Car");
        System.out.println(c.Model + " has been initalized with " + c.wheels + " wheels using Vehicle Constructor");
    }
}

class Car extends Vehicle {
    String Model;
    Car(int wheel, String model) {
        super(wheel);
        this.Model = model;
    }
}
