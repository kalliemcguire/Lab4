
public class Car {
    private int yearModel = 2009;
    private String make = "Chevy";
    private int speed = 0;
    
    public Car(int year, String type) {
        this.yearModel = year;
        this.make = type;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public double accelerate() {
        return speed += 5;
    }
    
    public double brake() {
        return speed -= 5;
    }
}
