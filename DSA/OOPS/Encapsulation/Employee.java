package DSA.OOPS.Encapsulation;

public class Employee {

    // Encapsulating the name and age
    // only approachable using getter and setter methods defined
    private String name;
    private int empID;
    private double salary;
    private String designation;

    // Constructor for Employee
    public Employee(String name, int empID, double salary, String designation) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
        this.designation = designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }
}
