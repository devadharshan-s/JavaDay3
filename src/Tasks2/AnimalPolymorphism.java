package Tasks2;

public class AnimalPolymorphism {
    void speak(){
        System.out.println("Animal is Speaking...");
    }
}
class DogAnimal extends AnimalPolymorphism{
    @Override
    void speak(){
        System.out.println("Dog is Speaking...");
    }
}
class CatAnimal extends AnimalPolymorphism{
    @Override
    void speak(){
        System.out.println("Cat is Speaking...");
    }
}

class AnimalPolymorphismMain{
    public static void main(String[] args) {
        AnimalPolymorphism a = new DogAnimal();
        AnimalPolymorphism b = new CatAnimal();
        a.speak();
        b.speak();
    }
}