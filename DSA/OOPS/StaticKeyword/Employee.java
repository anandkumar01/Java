package DSA.OOPS.StaticKeyword;

public class Employee {
    private String name;
    private String projectName;
    
    // Static instance variable doesn't dependent on objects
    public static int noOfEmployee = 0;

    public Employee(String name, String projectName){
        this.name = name;
        this.projectName = projectName;
        noOfEmployee +=1;
    }

    public void projectDetails(){
        System.out.println(name + " is allocated to " +  projectName);
        isBillable();
    }

    public static void isBillable(){
        // projectDetails();       // Non static method is not allowed in static method
        System.out.println("Project is not billable");
    }

}
