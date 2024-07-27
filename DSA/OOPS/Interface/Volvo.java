package DSA.OOPS.Interface;

public class Volvo implements Car {
    
    private String modelName;
    private int year;

    // Constructor for Volvo
    public Volvo(String modelName, int year) {
        this.modelName = modelName;
        this.year = year;
    }

    @Override
    public void start() {
        System.out.println(modelName + " is starting with a button.");
    }

    @Override
    public void stop() {
        System.out.println(modelName + " is stopping with automatic brakes.");
    }

    @Override
    public void accelerate() {
        System.out.println(modelName + " is accelerating automatically.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Volvo modelName: " + modelName + ", Year: " + year);
    }

    @Override
    public void playMusic() {
        System.out.println(modelName + " is playing music.");
    }
}
