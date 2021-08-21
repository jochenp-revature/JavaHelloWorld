package src;
import java.util.Scanner;

public class Salary {
    
    public static double salCalc(double hoursWorked, double hourlyRate) {
        double grossSalary = hoursWorked * 52 * hourlyRate;
        return grossSalary;
    }

    public static void main(String[] args) {
        double salary = salCalc(38.5, 25.88);
        System.out.println("Your total salary thus far is: " + salary);
    }
}
