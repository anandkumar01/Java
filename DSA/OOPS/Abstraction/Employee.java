package DSA.OOPS.Abstraction;

public abstract class Employee {
    private String name;
    private int age;
    private int salary;
    private String project;

    Employee(String name, int age, int salary, String project){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.project = project;
    }

    abstract void projectDeployment();

    void projectDetails(){
        System.out.println(name + " is allocated to " + project + " project");
    }

    void displayInfo(){
        System.out.println(name + " is " + age + " years old and salary is " + salary);
    }
}
