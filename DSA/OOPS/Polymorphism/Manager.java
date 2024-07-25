package DSA.OOPS.Polymorphism;

class Manager extends Employee {
    int teamsize;

    // Constructor for Manager
    Manager(String name, int id, int teamsize) {
        super(name, id);        // calling superclass constructor
        this.teamsize = teamsize;
    }

    @Override
    void work(){
        System.out.println(name + " is managing a team of size " + teamsize);
    }
    
}
