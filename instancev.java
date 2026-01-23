//write one program in java to implement instance variable and method
class Student {
    String name;

    void display() {
        System.out.println("Name:" + name);

    }
}

public class instancev {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Prachi";
        s1.display();

    }
}