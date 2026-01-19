//Write a program in java where you should be passing two variables inside a function with float data types and performing their addition inside the  main function using double data types.
import java.util.Scanner;

public class addition {
    static double add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first float number:");
        float a = sc.nextFloat();
        System.out.println("Enter second float number:");
        float b = sc.nextFloat();
        double sum = add(a, b);
        System.out.println("The sum is: " + sum);
        sc.close();
    }

}
