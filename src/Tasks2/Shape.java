package Tasks2;

abstract public class Shape {
    abstract int area();
    void display(){
        System.out.println("Area: " + area());
    }
}

class Rectangle extends Shape {
    int l,b;
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    @Override
    int area(){
        return l*b;
    }

}

class Circle extends Shape {
    int radius;
    Circle(int radius){
        this.radius = radius;
    }

    int area(){
        return (int) (3.14 * radius * radius);
    }
}

class ShapeMain{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,15);
        rectangle.display();
        Circle circle = new Circle(5);
        circle.display();
    }
}