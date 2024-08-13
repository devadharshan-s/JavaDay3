package Tasks;

public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Animal a = new Animal();
        Main.printAnimalType(d);
        Main.printAnimalType(c);
        Main.printAnimalType(a);
    }
}
class Dog extends Animal {}
class Cat extends Animal {}
class Main{
    static void printAnimalType(Animal obj){
        if(obj instanceof Dog){
            System.out.println("Dog");
        }
        else if(obj instanceof Cat){
            System.out.println("Cat");
        } else System.out.println("Animal");
    }

}
