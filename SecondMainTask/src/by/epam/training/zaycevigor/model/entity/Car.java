package by.epam.training.zaycevigor.model.entity;

import static by.epam.training.zaycevigor.constcontainer.Constants.*;

public class Car extends Vehicle {

    public Car(){
        
    }
    
    public Car(double loadCapasity, int passengerCapasity, double vehicleCost, double fuelUsage) {
        super(loadCapasity, passengerCapasity, vehicleCost, fuelUsage);
    }

}
