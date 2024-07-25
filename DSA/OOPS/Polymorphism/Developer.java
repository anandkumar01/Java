package DSA.OOPS.Polymorphism;

class Developer extends Employee {
    String language;

    // Constructor for Developer
    Developer(String name, int id, String language){
        super(name, id);        // Calling superclass constructor
        this.language = language;
    }

    @Override
    void work(){
        System.out.println(name + " is working on " + language + " language");
    }
}
