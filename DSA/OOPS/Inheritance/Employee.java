package DSA.OOPS.Inheritance;

public class Employee {
    
    private String name;
    private int salary;
    private String company;
    
    // Constructor for Employee
    public Employee(String name, int salary, String company){
        this.name = name;
        this.salary = salary;
        this.company = company;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSalary() {
        return salary;
    }

    public void displayDetails(){
        System.out.println("Employee name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println(name + " works in " + company);
    }
}
