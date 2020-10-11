
import java.util.Scanner;

public class Cardemo {
    public static void main(String[] args) {
        Car myCar = new Car(2009, "Chevy");
        
        for (int i = 1; i <= 5; i++) {   
            myCar.accelerate();
            System.out.println("Current speed: " + myCar.getSpeed());
        }
        
        for (int i = 1; i <= 5; i++) {
            myCar.brake();
            System.out.println("Current speed: " + myCar.getSpeed());
        } 
    }
}
