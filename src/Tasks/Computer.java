package Tasks;

public class Computer {
    final void powerOn(){
        System.out.println("Computer is powering On");
    }

    public static void main(String[] args) {
        Laptop lap = new Laptop();
//        lap.powerOn();
        lap.portablePowerOn();
    }
}

class Laptop extends Computer{
    //Always Fails because method is final.
//    @Override
//    void powerOn(){
//        System.out.println("Laptop is powering On");
//    }

    void portablePowerOn(){
        System.out.println("Laptop is powering On");
    }
}
