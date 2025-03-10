import java.util.Scanner;
//defining the Employee details
public class EmployeeDetails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //input details
        System.out.println("Name ");
        String employeeName = sc.nextLine();
        System.out.println("Id ");
        int employeeId = sc.nextInt();
        System.out.println("Salary ");
        int employeeSalary  = sc.nextInt();

        //create EmployeeData object
        EmployeeData employee = new EmployeeData(employeeName,employeeId,employeeSalary);
        employee.displayDetails();

        //closing the scanner class
        sc.close();
    }
}
//this code is written by Harman Veer Singh
class EmployeeData {
    String employeeName;
    int employeeId;
    double employeeSalary;

    //constructor class to initialise the employee details
    public EmployeeData(String employeeName, int employeeId, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
    }

    // display the employee details
    public void displayDetails() {
        System.out.println("EmployeeName " + employeeName);
        System.out.println("EmployeeId " + employeeId);
        System.out.println("EmployeeSalary " + employeeSalary);
    }
}
//input
// Name
// Harman Veer Singh
// Id
// 3
// Salary
// 50000
//output
// EmployeeName Harman Veer Singh
// EmployeeId 3
// EmployeeSalary 50000.0

