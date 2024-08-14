package Tasks2;

public interface MathOperations {
    static int add(int a, int b){
        return a+b;
    }
}

class MathOperationsMain{
    public static void main(String[] args) {
        System.out.println(MathOperations.add(10,5));
    }
}
