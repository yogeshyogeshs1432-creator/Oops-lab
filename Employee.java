import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private int empId;
    private String name;
    private double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeSalaryUpdate {
    public static void main(String[] args) {
        Map<Integer, Employee> employees = new HashMap<>();

        employees.put(101, new Employee(101, "Arun", 25000));
        employees.put(102, new Employee(102, "Priya", 30000));
        employees.put(103, new Employee(103, "Kumar", 28000));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        if (employees.containsKey(id)) {
            Employee emp = employees.get(id);

            System.out.println("\nEmployee Details");
            System.out.println("Employee ID: " + emp.getEmpId());
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Current Salary: Rs. " + emp.getSalary());

            System.out.print("Enter Updated Salary: ");
            double newSalary = sc.nextDouble();

            emp.setSalary(newSalary);

            System.out.println("Updated Salary: Rs. " + emp.getSalary());
        } else {
            System.out.println("Employee not found");
        }

        sc.close();
    }
}
