public class Polymorphism {
    void complietime(String type){
        System.out.println(type + " Class");
    }

    void runtime(){
        System.out.println("Runtime Polymorphism in Parent Class");
    }

    public static void main(String[] args) {
        RunTime rt = new RunTime();
        rt.complietime("Child","Class");
        rt.runtime();
    }
}

class RunTime{
    void complietime(String type, String type2){
        System.out.println("Compiletime Polymorphism in " + type + " " + type2);
    }

    void runtime(){
        System.out.println("Runtime Polymorphism in Child Class");
    }
}
