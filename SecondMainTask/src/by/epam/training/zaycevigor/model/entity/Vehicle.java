package by.epam.training.zaycevigor.model.entity;

import by.epam.training.zaycevigor.exceptions.VehicleException;

public class Vehicle {

    private static final String WRONG_INDEX = "The follow index is wrong:";

    private static int count;

    private String index;

    private double loadCapasity;
    private int passengerCapasity;
    private double vehicleCost;
    private double fuelUsage;

    static {
        count = 0;
    }

    public Vehicle() {

    }

    public Vehicle(double loadCapasity, int passengerCapasity, double vehicleCost, double fuelUsage) {
        this.index = Integer.toString(count + 1);
        this.loadCapasity = loadCapasity;
        this.passengerCapasity = passengerCapasity;
        this.vehicleCost = vehicleCost;
        this.fuelUsage = fuelUsage;
        count++;
    }

    public String index() {
        return index;
    }

    public void setIndex(int index) throws VehicleException {
        if (index < 1) {
            this.index = WRONG_INDEX + index;
        } else {
            throw new VehicleException(WRONG_INDEX, index);
        }
    }

    public double loadCapasity() {
        return loadCapasity;
    }

    public void setLoadCapasity(double loadCapasity) {
        this.loadCapasity = loadCapasity;
    }

    public int passengerCapasity() {
        return passengerCapasity;
    }

    public void setPassengerCapasity(int passengerCapasity) {
        this.passengerCapasity = passengerCapasity;
    }

    public double vehicleCost() {
        return vehicleCost;
    }

    public void setVehicleCost(double vehicleCost) {
        this.vehicleCost = vehicleCost;
    }

    public double fuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public static int count() {
        return count;
    }

    public double getFuelUsageByDistance(double distance) {
        return fuelUsage * distance;
    }

    @Override
    public String toString() {
        return getClass() + " \t index - " + index + ";\t Capasity: 1)Load - "
                + loadCapasity + ", 2)Passenger - " + passengerCapasity
                + ";\t" + getClass() + " cost - " + vehicleCost + ";\t Fuel usage - " + fuelUsage + ";";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.loadCapasity) ^ (Double.doubleToLongBits(this.loadCapasity) >>> 32));
        hash = 71 * hash + this.passengerCapasity;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.vehicleCost) ^ (Double.doubleToLongBits(this.vehicleCost) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.fuelUsage) ^ (Double.doubleToLongBits(this.fuelUsage) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (Double.doubleToLongBits(this.loadCapasity) != Double.doubleToLongBits(other.loadCapasity)) {
            return false;
        }
        if (this.passengerCapasity != other.passengerCapasity) {
            return false;
        }
        if (Double.doubleToLongBits(this.vehicleCost) != Double.doubleToLongBits(other.vehicleCost)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fuelUsage) != Double.doubleToLongBits(other.fuelUsage)) {
            return false;
        }
        return true;
    }

}
