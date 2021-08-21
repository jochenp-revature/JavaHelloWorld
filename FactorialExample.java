package src;
import java.util.Scanner;

public class FactorialExample {
    
    public static void main(String[] args) {
        System.out.println("Enter a number to find the factorial: ");
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        System.out.println("Factorial of 5 is: "+factorial(f));
    }

    private static int factorial(int b) {
        if(b==1) {
            return 1;
        }
        return b * factorial(b-1);
    }
}
