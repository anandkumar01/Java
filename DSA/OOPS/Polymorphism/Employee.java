package DSA.OOPS.Polymorphism;

class Employee {
    
    String name;
    int id;

    // Constructor for Employee
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    void work(){
        System.out.println(name + " is working");
    }
}
