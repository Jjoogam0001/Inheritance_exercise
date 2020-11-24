package org.inheritance;

import Model.Car;
import Model.Motorcycle;
import Model.Truck;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car("Person Car",001,"SUV","1994-03-23","200","Audi");
        Motorcycle motorcycle = new Motorcycle("MC",002,"SUV","1994-03-23","500","Audi");
        Truck truck = new Truck("Volvo",003,"SUV","1994-03-23","100","Audi");

        System.out.println(car.getName() + " "+car.getDescription() +" "+car.getManufucaturingDate() + " "+ car);
        System.out.println(motorcycle.getName() + " "+motorcycle.getDescription() +" "+motorcycle.getManufucaturingDate() + " "+ motorcycle);
        System.out.println(truck.getName() + " "+truck.getDescription() +" "+truck.getManufucaturingDate() + " "+ truck);




    }
}
