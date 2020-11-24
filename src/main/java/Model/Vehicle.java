package Model;

import java.util.Date;

public class Vehicle {

    private String name;
    private int id;
    private String description;
    private String manufucaturingDate;

    public Vehicle(String name, int id, String description, String manufucaturingDate) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.manufucaturingDate = manufucaturingDate;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getManufucaturingDate() {
        return manufucaturingDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setManufucaturingDate(String manufucaturingDate) {
        this.manufucaturingDate = manufucaturingDate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Name='" + name + '\'' +
                ", Id=" + id +
                ", Description='" + description + '\'' +
                ", ManufucaturingDate=" + manufucaturingDate +
                '}';
    }

    public void drive(){

    }
}
