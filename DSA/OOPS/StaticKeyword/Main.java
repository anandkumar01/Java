package DSA.OOPS.StaticKeyword;

public class Main {
    public static void main(String[] args) {
        Employee anand = new Employee("Anand", "NSE Project");
        Employee abhinav = new Employee("Abhinav", "Insurence");

        // Independent of object due to static member
        System.out.println(anand.noOfEmployee);
        System.out.println(abhinav.noOfEmployee);
        
        anand.projectDetails();
    }
}
