package Tasks;

public class Calculator {
    Calculator(){

    }
    Calculator(int a, int b){
        a = 0;
        b = 0;
    }
    Calculator(double a, double b){
        a = 0.0;
        b = 0.0;
    }
    Calculator(String a, String b){
        a = "";
        b = "";
    }

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        new Calculator(10,10);
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10.5, 20.4));
        System.out.println(c.add("Hello", "World"));
    }
}
