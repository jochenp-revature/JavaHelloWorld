package src;
import java.util.Scanner;

public class Teatime {

    public static void announceDevTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to your new job!");
        announceDevTeaTime();
        System.out.println("Write Code!");
        System.out.println("Review Code!");
        announceDevTeaTime();
        System.out.println("Get promoted!");
    }
}
