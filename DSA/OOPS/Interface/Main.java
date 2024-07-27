package DSA.OOPS.Interface;

public class Main {

    public static void main(String[] args) {
        // Create an object of the interface
        Car maruti = new Maruti("Maruti 800", 2018);
        maruti.start();
        maruti.accelerate();
        maruti.playMusic();
        maruti.displayInfo();
        maruti.stop();

        Car volvo = new Volvo("Volvo XC90", 2023);
        volvo.start();
        volvo.accelerate();
        volvo.playMusic();
        volvo.displayInfo();
        volvo.stop();
    }
    
}
