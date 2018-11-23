package by.epam.training.zaycevigor.model.entity;

import static by.epam.training.zaycevigor.constcontainer.Constants.*;

public class Train extends Vehicle {

    private static final int BASIC_TRAIN_CAR_COUNT = 10;

    private int trainCarCount;

    {
        trainCarCount = BASIC_TRAIN_CAR_COUNT;
    }

    public Train() {

    }

    public Train(double loadCapasity, int passengerCapasity, double vehicleCost, double fuelUsage, int trainCarCount) {
        super(loadCapasity, passengerCapasity, vehicleCost, fuelUsage);
        this.trainCarCount = trainCarCount;
    }

    public Train(double loadCapasity, int passengerCapasity, double vehicleCost, double fuelUsage) {
        super(loadCapasity, passengerCapasity, vehicleCost, fuelUsage);
    }

    @Override
    public String toString() {
        return super.toString() + "\t Count of train car - " + trainCarCount + ";";
    }

    public int getTrainCarCount() {
        return trainCarCount;
    }

    public void setTrainCarCount(int trainCarCount) {
        this.trainCarCount = trainCarCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        final Train other = (Train) obj;

        if (Double.doubleToLongBits(this.trainCarCount) != Double.doubleToLongBits(other.trainCarCount)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.trainCarCount) ^ (Double.doubleToLongBits(this.trainCarCount) >>> 32));
        return hash;
    }

}
