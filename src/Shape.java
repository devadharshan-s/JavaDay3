import java.awt.*;

public class Shape {
    public void draw() {
        System.out.println("Drawing a Shape");
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Shape();

        for(Shape s : shapes) {
            s.draw();
        }
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a Circle...");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a Square...");
    }
}
