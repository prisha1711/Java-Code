interface AnimalI {
    void sound(); 
}

class DogI implements AnimalI {

    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        AnimalI a = new DogI();
        a.sound();

    }
}
