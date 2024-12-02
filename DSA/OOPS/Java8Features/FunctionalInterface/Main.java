package DSA.OOPS.Java8Features.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create a list of Employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anand", "QEA", 36399.0));
        employees.add(new Employee("Abhinav", "Development", 58000.0));
        employees.add(new Employee("Ayush", "IT", 38000.0));
        employees.add(new Employee("Pawan", "Finance", 46290.0));

        // Define a lambda expression for filtering high-salary employees
        EmployeeFilter highSalaryFilter = emp -> emp.getSalary() > 40000.0;

        // Define a lambda expression for filtering employees in the IT department
        EmployeeFilter itDepartmentFilter = emp -> emp.getDepartment().equals("IT");

        System.out.println("Employees with high salaries:");
        processEmployees(employees, highSalaryFilter);

        System.out.println("\nEmployees in IT department:");
        processEmployees(employees, itDepartmentFilter);
    }

    private static void processEmployees(List<Employee> employees, EmployeeFilter filter) {
        for (Employee employee : employees) {
            if (filter.filter(employee)) {
                System.out.println(employee);
            }
        }
    }
}
