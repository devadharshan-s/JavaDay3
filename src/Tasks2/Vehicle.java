package Tasks2;

public interface Vehicle {
    default void start(){
        System.out.println("Vehicle is starting...");
    }
}
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

class Bike implements Vehicle {

}

class VechicleMain{
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        Bike b = new Bike();
        b.start();
    }
}
