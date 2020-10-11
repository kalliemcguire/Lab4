
public class Circle {
    private double radius;
    private final double PI = 3.14;
    
    public Circle() {
        this.radius = 0.0;
    }
    
    public Circle(double rad) {
        this.radius = rad;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea(double radius) {
        return PI * radius * radius;
    }
    
    public double calculateDiameter(double radius) {
        return radius * 2;
    }
    
    public double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }
}
