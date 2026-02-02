abstract class Animal {

    abstract void sound();  // Abstract method

    void eat() {            // Concrete (normal) method
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class AbstractMethodExample {

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();  // Output: Dog barks.
        animal.eat();    // Output: This animal eats food.
    }
}
