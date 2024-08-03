package DSA.OOPS.Inheritance;

public class Developer extends Employee {

    private int bonus;

    // Constructor for Developer
    public Developer(String name, int salary, String company, int bonus) {
        super(name, salary, company);
        this.bonus = bonus;
    }

    public void bonusDetails(){
        System.out.println(getName() + " gets bonus of " + bonus + " yearly");
    }

    // Calculated salary after bonus
    public int calculateSalary() {
        int totalSalary = getSalary() + bonus;
        return totalSalary;
    }
}
