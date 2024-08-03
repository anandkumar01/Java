package DSA.OOPS.Inheritance;

public class BackendDeveloper extends Developer {

    private String role;

    public BackendDeveloper(String name, int salary, String company, int bonus, String role) {
        super(name, salary, company, bonus);
        this.role = role;
    }

    public void projectRole() {
        System.out.println(getName() + " works as a " + role);
    }
}
