//write a program in  java to divide two numbers where you should be checking the condition of divide by 0 error.
import java.util.Scanner;

public class division {
    static int divide(int a, int b) {
        if (b == 0) {
            System.out.print("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int result = divide(a, b);
        if (b != 0) {
            System.out.println("The result is: " + result);
        }
        sc.close();
    }
}
