import java.util.Scanner;
import java.util.Arrays;

public class InteractiveArrays {
	// static binds this field to the class scope
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int size = 5;
		int[] returnedArr = getIntegers(size);
        printArray(returnedArr);
		double avg = getAverage(returnedArr);
		System.out.println("The average of all values in your array is " + avg);
	}
	
	// step 1: Let's create a method that asks the user to create an 
	// array and input some custom values to populate the array
	static int[] getIntegers(int capacity) {
		System.out.println("Enter " + capacity + " integers");
		int[] values = new int[capacity];
		for(int i=0; i<values.length; i++) {
			values[i] = scan.nextInt();
		}		
		return values;
	}
	
	// Bonus print method using Arrays utility method toString
	static void printArray(int[] arr) {
        System.out.println("The values you entered were:");
		System.out.println(Arrays.toString(arr));
	}
	
    // My getAverage method for the returnedArr
    static double getAverage(int[] values) {
        double sum = 0;
        for (int i=0; i<values.length; i++) {
            sum += values[i];
        }
        double average = sum / values.length;
        return average;
    }
}