 /*write a program in java using parameterized constructor to find the :
addition
subtraction
multiplication
division
between two numbers giving a number as a choice */
import java.util.Scanner;

class Calculate {
    int a;
    int b;

    Calculate(int x, int y) {
        a = x;
        b = y;
    }

    int addition() {
        return a + b;
    }

    int subtraction() {
        return a - b;
    }

    int multiplication() {
        return a * b;
    }

    int division() {
        return a / b;
    }

}

public class Calculation {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        Calculate c = new Calculate(num1, num2);

        System.out.println("Addition: " + c.addition());
        System.out.println("Subtraction: " + c.subtraction());
        System.out.println("Multiplication: " + c.multiplication());
        System.out.println("Division: " + c.division());

        sc.close();

    }
} 
