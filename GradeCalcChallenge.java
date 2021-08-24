import java.util.Scanner;
import java.lang.Math;

public class GradeCalcChallenge {

    public static void main(String[] args) {
        System.out.println("Enter the number correct, followed by the total number:");
        Scanner input = new Scanner(System.in);
        double right = input.nextDouble();
        double total = input.nextDouble();

        // make this a method?
        double score = (right / total) * 100;
        int gradeValue = (int) Math.round(score);

        char letterGrade;

        if (gradeValue >= 90) {
            letterGrade = 'A';
        } else if (gradeValue >= 80) {
            letterGrade = 'B';
        } else if (gradeValue >= 70) {
            letterGrade = 'C';
        } else if (gradeValue >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        System.out.println("Student scores " + right + " out of " + total +
            " for a score of " + score + " which rounds to " + gradeValue +
            " and a letter grade of " + letterGrade + ".");
    }
    
}
