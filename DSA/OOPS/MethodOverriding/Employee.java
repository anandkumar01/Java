package DSA.OOPS.MethodOverriding;

class Employee {

    String name;
    double salary;

    // Constructor for Employee
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    void displayDetails(){
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }
}
