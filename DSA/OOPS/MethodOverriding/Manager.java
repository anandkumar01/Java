package DSA.OOPS.MethodOverriding;

class Manager extends Employee {
    
    String department;

    // Constructor for Manager
    public Manager(String name, double salary, String department) {
        super(name, salary);        // Calling superclass constructor
        this.department = department;
    }

    // Overriding the displayDetails() method
    @Override
    void displayDetails(){
        super.displayDetails();     // Calling superclass method
        System.out.println("Manager Department: " + department);
    }
}
