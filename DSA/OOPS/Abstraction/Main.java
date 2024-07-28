package DSA.OOPS.Abstraction;

public class Main {
    public static void main(String[] args) {
        Employee developer = new Developer("Anand", 24, 30000, "NSE Fots T&M");
        developer.displayInfo();
        developer.projectDetails();
        developer.projectDeployment();
    }
}
