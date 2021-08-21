package src;
import java.util.Scanner;

public class MultipleChoice {

    public static void main(String args[]) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "earth";
        String choiceTwo = "jupiter";
        String choiceThree = "saturn";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Choose one of the following: " +
            choiceOne + ", " + choiceTwo + ", " + choiceThree + ".");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if(correctAnswer.equals(input)) {
            System.out.println("Congrats!  That's the correct answer!");
        } else {
            System.out.println("You are incorrect.  The correct answer is " + correctAnswer);
        }

    }
}