//write a program in java using a parameterized constructor to print name, roll no and prn of user using scanner sc (input from the user)
import java.util.Scanner;

class Student {
    String name;
    int rollno;
    int prn;

    Student(String n, int r, int p) {
        name = n;
        rollno = r;
        prn = p;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("PRN: " + prn);
    }
}

public class parameterized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the roll no:");
        int rollno = sc.nextInt();
        System.out.println("Enter the prn:");
        int prn = sc.nextInt();
        Student s = new Student(name, rollno, prn);
        s.display();
        sc.close();

    }

}