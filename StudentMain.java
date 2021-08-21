package src;

public class StudentMain {

    public static void main(String[] args) {
        StudentProfile studentA = new StudentProfile("John", "Doe", 2022, 3.4, "Economics");
        StudentProfile studentB = new StudentProfile("Sally", "Hemmingway", 2023, 4.0, "Psychology");

        int studentAIncrement = studentA.incrementYear();
        System.out.println(studentAIncrement);

        int studentBIncrement = studentB.incrementYear();
        System.out.println(studentBIncrement);
    }
    
}
