package Model;

import java.util.Date;

public class Car extends Vehicle {

    private String MaxSpeed;
    private String Make;

    public Car(String name, int id, String description, String manufucaturingDate, String maxSpeed, String make) {
        super(name, id, description, manufucaturingDate);
        MaxSpeed = maxSpeed;
        Make = make;
    }

    public String getMaxSpeed() {
        return MaxSpeed;
    }

    public String getMake() {
        return Make;
    }

    public void setMaxSpeed(String maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public void setMake(String make) {
        Make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "MaxSpeed='" + MaxSpeed + '\'' +
                ", Make='" + Make + '\'' +
                '}';
    }
    @Override
    public void drive() {
        System.out.println("Vooommmmm");
    }
}
