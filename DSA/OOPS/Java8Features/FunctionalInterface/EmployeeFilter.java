package DSA.OOPS.Java8Features.FunctionalInterface;

@FunctionalInterface
public interface EmployeeFilter {

    // Exactly one Abstract method to be functional interface
    boolean filter(Employee employee);
}
