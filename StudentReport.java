import java.util.Scanner;
public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String StudentName = sc.nextLine();
        System.out.println("Enter Roll Number: ");
        int StudentRollNumber = sc.nextInt();
        System.out.println("Enter Marks: ");
        double StudentMarks = sc.nextDouble();

        // Create Student object and display details
        StudentDetails student = new StudentDetails(StudentName, StudentRollNumber, StudentMarks);
        student.displayDetails();
        sc.close();
    }
}
//Defining StudentDetails class
class StudentDetails {
    String StudentName;
    int StudentRollNumber;
    double StudentMarks;

    // Constructor to initialize student details
    public StudentDetails(String StudentName, int StudentRollNumber, double StudentMarks) {
        this.StudentName = StudentName;
        this.StudentRollNumber = StudentRollNumber;
        this.StudentMarks = StudentMarks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (StudentMarks >= 90) {
            return "A";
        } else if (StudentMarks >= 80) {
            return "B";
        } else if (StudentMarks >= 70) {
            return "C";
        } else if (StudentMarks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Name: " + StudentName);
        System.out.println("Roll Number: " + StudentRollNumber);
        System.out.println("Marks: " + StudentMarks);
        System.out.println("Grade: " + calculateGrade());
    }
}
//input
//Enter Student Name:
//Harman
//Enter Roll Number:
//        12
//Enter Marks:
//        82
//output
//Student Name: Harman
//Roll Number: 12
//Marks: 82.0
//Grade: B

