package src;

public class ReverseOrder {
    
    public static void main(String[] args) {
        //use recursion to print a list in reverse order
        int[] numList = {10,20,30,40,50};
        reversePrint(numList);
        System.out.println("");
    }

    private static void reversePrint(int[] numbers) {
        if(numbers.length == 0) {
            return;
        }
        int[] a = new int[numbers.length-1];
        for(int i = 0; i<numbers.length-1; i++) {
            a[i] = numbers[i+1];
        }
        reversePrint(a);
        System.out.print(numbers[0]+" ");
    }
}