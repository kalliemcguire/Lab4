
import java.util.Scanner;

public class Circledemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the radius:");
        double radius = keyboard.nextDouble();
        
        Circle myCircle = new Circle(radius);
        
        System.out.println("Area: " + myCircle.calculateArea(radius));
        System.out.println("Diameter: " + myCircle.calculateDiameter(radius));
        System.out.println("Circumference: " + myCircle.calculateCircumference(radius));
    }
  
}
