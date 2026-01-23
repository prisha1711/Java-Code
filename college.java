//write a program in java using a static variable to display a student detail where college name will be coming through static variable
class University {
    static String college_name = "Symbiosis Institute of Technology";
    String name;
    int age;

    University(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("College Name: " + college_name);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

}

public class college {
    public static void main(String[] args) {
        University s1 = new University("Prisha", 19);
        University s2 = new University("Komal", 19);
        s1.display();
        s2.display();

    }
}