package DSA.OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        
        Employee emp1 = new Developer("Anand", 2303799, "Java");
        Employee emp2 = new Manager("Sachin", 238562, 8);

        // Polymorphism
        emp1.work();
        emp2.work();
    }  
}
