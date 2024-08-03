package DSA.OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Developer anand = new Developer("Anand", 450000, "Cognizant", 50000);
        Developer abhinav = new Developer("Abhinav", 900000, "DeepTek", 80000);

        anand.displayDetails();
        anand.bonusDetails();
        System.out.println(anand.getName() + " gets salary after bonus: " + anand.calculateSalary());

        System.out.println();
        
        abhinav.displayDetails();
        abhinav.bonusDetails();
        System.out.println(abhinav.getName() + " gets salary after bonus: " + abhinav.calculateSalary());

    }
}
