import java.util.Scanner;

class Employee {
    int id;
    String name;
    float salary;
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employees = new Employee();

        System.out.print("Enter employee ID: ");
        employees.id = scanner.nextInt();

        System.out.print("Enter employee name: ");
        employees.name = scanner.next();

        System.out.print("Enter employee salary: ");
        employees.salary = scanner.nextFloat();
        
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + employees.id + "\nName: " + employees.name + "\nSalary: " + employees.salary);

        scanner.close();
    }
}
