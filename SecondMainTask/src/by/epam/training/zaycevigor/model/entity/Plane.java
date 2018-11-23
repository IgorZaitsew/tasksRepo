package by.epam.training.zaycevigor.model.entity;

import static by.epam.training.zaycevigor.constcontainer.Constants.*;

public class Plane extends Vehicle {

    private static final int BASIC_RUNWAY_LENGTH = 4000;

    private int runwayLength;

    {
        runwayLength = BASIC_RUNWAY_LENGTH;
    }

    public Plane() {

    }

    public Plane(double loadCapasity, int passengerCapasity, double vehicleCost, double fuelUsage) {
        super(loadCapasity, passengerCapasity, vehicleCost, fuelUsage);
    }

    public Plane(double loadCapasity, int passengerCapasity, double vehicleCost, double fuelUsage, int runwayLength) {
        super(loadCapasity, passengerCapasity, vehicleCost, fuelUsage);
        this.runwayLength = runwayLength;
    }

    public int getRunwayLength() {
        return runwayLength;
    }

    public void setRunwayLength(int runwayLength) {
        this.runwayLength = runwayLength;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        final Plane other = (Plane) obj;

        if (Double.doubleToLongBits(this.runwayLength) != Double.doubleToLongBits(other.runwayLength)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.runwayLength) ^ (Double.doubleToLongBits(this.runwayLength) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return super.toString() + "\t Minimal runway length - " + runwayLength + ";";
    }

}
