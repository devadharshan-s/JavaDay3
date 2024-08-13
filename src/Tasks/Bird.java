package Tasks;

public class Bird {
    void fly(){
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
        Eagle obj = new Eagle();
        obj.fly();
    }
}


class Eagle extends Bird {
    @Override
    void fly(){
        System.out.println("Eagle is soaring");
    }
}
