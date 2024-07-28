package DSA.OOPS.Abstraction;

public class Developer extends Employee {

    Developer(String name, int age, int salary, String project) {
        super(name, age, salary, project);
    }

    @Override
    void projectDeployment() {
        System.out.println("Project deployment has done");
    }
    
}
