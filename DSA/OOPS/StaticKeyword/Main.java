package DSA.OOPS.StaticKeyword;

public class Main {
    public static void main(String[] args) {
        Employee anand = new Employee("Anand", "NSE Project");
        Employee abhinav = new Employee("Abhinav", "Insurence");
        Employee ayush = new Employee("Ayush", "Telecom");

        // Independent of object due to static variable
        System.out.println(anand.noOfEmployee);
        System.out.println(abhinav.noOfEmployee);
        System.out.println(ayush.noOfEmployee);
        
        anand.projectDetails();
    }
}
