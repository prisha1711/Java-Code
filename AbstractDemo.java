abstract class Shape {
    // Abstract method → no body
    abstract void draw();
    // Normal method → common for all shapes
    void info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.info();   // common method from abstract class
        s1.draw();   // child’s implementation

        s2.info();
        s2.draw();
    }
}
