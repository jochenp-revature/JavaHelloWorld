package src;

public class StudentProfile {
    String firstName;
    String lastName;
    int gradYear;
    double gpa;
    String declaredMajor;

    public StudentProfile(String firstName, String lastName,
                            int gradYear, double gpa,
                            String declaredMajor) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gradYear = gradYear;
    this.gpa = gpa;
    this.declaredMajor = declaredMajor;
    }

    public int incrementYear() {
        return this.gradYear = this.gradYear + 1;
    }
    
}
