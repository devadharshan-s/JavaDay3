package Tasks;

public class Appliance {
    void operate(){
        System.out.println("Appliance operating..");
    }

    void workHoursApp(int hours){
        System.out.println("Appliance will work for " + hours + " hours.");
    }

    void workMinutesApp(int hours,int minutes){
        System.out.println("Appliance will work for " + hours + " hours " + minutes + " minutes.");
    }

    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.operate();
        appliance.workHoursApp(10);
        appliance.workMinutesApp(10,30);

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.operate();
        washingMachine.workHoursApp(10);
        washingMachine.workMinutesApp(10,34);

        Refrigerator refrigerator = new Refrigerator();
        refrigerator.operate();
        refrigerator.workHoursApp(10);
        refrigerator.workMinutesApp(10,23);
    }
}
class WashingMachine extends Appliance {
    @Override
    void operate() {
        System.out.println("Washing machine operating..");
    }

    void workHoursWM(int hours){
        System.out.println("Washing Machine will work for " + hours + " hours.");
    }

    void workMinutesWM(int hours,int minutes){
        System.out.println("Washing will work for " + hours + " hours " + minutes + " minutes.");
    }
}
final class Refrigerator extends Appliance {
    @Override
    void operate() {
        System.out.println("Refrigerator operating..");
    }
    void workHoursRef(int hours){
        System.out.println("Appliance will work for " + hours + " hours.");
    }

    void workMinutesRef(int hours,int minutes){
        System.out.println("Appliance will work for " + hours + " hours " + minutes + " minutes.");
    }
}
