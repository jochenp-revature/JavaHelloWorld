package src;
import java.util.Scanner;

public class GCD {
    
    public static void main(String[] args) {
        System.out.println("Enter any two numbers and get the GCD:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(Greatest(x,y));
    }

    private static int Greatest(int a, int b) {
        int temp = a;
        if(a<b) {
            a = b;
            b = temp;
        }
        if(b==0) {
            return a;
        }
        return Greatest(b, (a%b));
    }
}
