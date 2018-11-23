/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.model.entity;

import by.epam.training.zaycevigor.exceptions.VehicleException;

/**
 *
 * @author Игорь
 */
public class Station {

    private static final int BASIC_SIZE = 10;
    private static final String VEH_NULL_EX = "Given vehicle is null!";
    private static final String OUT_OF_INDEX = "Given index is out of array";

    private static int maxBusyIndex;

    private Vehicle[] vehicleContainer;
    private int count;

    static {
        maxBusyIndex = 0;
    }

    public Station() {
        vehicleContainer = new Vehicle[BASIC_SIZE];
        count = BASIC_SIZE;
    }

    public Station(int size) {
        vehicleContainer = new Vehicle[size];
        count = size;
    }

    public Station(Vehicle[] vehicles) {
        count = vehicles.length;
        vehicleContainer = new Vehicle[count];
        System.arraycopy(vehicles, 0, vehicleContainer, 0, count);
    }

    public void set(Vehicle vehicle, int index) throws VehicleException {
        if (index < count && index >= 0) {

            if (vehicle != null) {
                vehicleContainer[index] = vehicle;
                if (maxBusyIndex < index) {
                    maxBusyIndex = index;
                }
            } else {
                throw new VehicleException(VEH_NULL_EX, index);
            }

        } else {
            throw new VehicleException(OUT_OF_INDEX, index);
        }
    }

    public void add(Vehicle vehicle) throws VehicleException {
        if (vehicle != null) {
            if (maxBusyIndex >= count) {
                throw new VehicleException(OUT_OF_INDEX, maxBusyIndex);
            }
            vehicleContainer[maxBusyIndex] = vehicle;
            maxBusyIndex++;
        } else {
            throw new VehicleException(VEH_NULL_EX, maxBusyIndex);
        }

    }

    public Vehicle vehicle(int index) throws VehicleException {
        if (index > count && index < 0) {
            throw new VehicleException(OUT_OF_INDEX, index);
        }

        return vehicleContainer[index];
    }

    public int count() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder toStr = new StringBuilder(" ");
        for (Vehicle vehicle : vehicleContainer) {
            toStr.append(vehicle.toString()).append("\n");
        }
        return toStr + " ";
    }
}
