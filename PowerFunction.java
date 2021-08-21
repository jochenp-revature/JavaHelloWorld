package src;
import java.util.Scanner;

public class PowerFunction {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your base number and exponent:");
        int number = in.nextInt();
        int exp = in.nextInt();
        System.out.println(power(number, exp));
    }
    
    private static int power(int x, int n) {
        int y;
        if(n==0) {
            return 1;
        }
        y = power(x, n/2);
        y = y*y;
        if(n % 2 == 0 ) {
            return y;
        }
        return x * y;
    }
}
