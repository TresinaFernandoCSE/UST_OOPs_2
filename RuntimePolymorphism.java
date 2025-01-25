
// Runtime Polymorphism Example
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a Square.");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Shape shape;
        
        shape = new Circle();
        shape.draw();
        
        shape = new Square();
        shape.draw();
    }
}
