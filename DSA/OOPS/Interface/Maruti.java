package DSA.OOPS.Interface;

public class Maruti implements Car {

    private String modelName;
    private int year;

    // Constructor for Maruti
    public Maruti(String modelName, int year){
        this.modelName = modelName;
        this.year = year;
    }

    @Override
    public void start() {
        System.out.println(modelName + " is starting with a key ignition.");
    }

    @Override
    public void stop() {
        System.out.println(modelName + " is stopping with manual brakes.");
    }

    @Override
    public void accelerate() {
        System.out.println(modelName + " is accelerating manually.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Maruti Model: " + modelName + ", Year: " + year);
    }

    @Override
    public void playMusic() {
        System.out.println(modelName + " is playing music.");        
    }
    
}
