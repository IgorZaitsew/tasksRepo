package by.epam.training.zaycevigor.model.util;

import static by.epam.training.zaycevigor.constcontainer.Constants.END_OF_LINE;
import static by.epam.training.zaycevigor.constcontainer.Constants.START_OF_LINE;
import static by.epam.training.zaycevigor.constcontainer.Constants.VALUES_DIVIDER;
import by.epam.training.zaycevigor.exceptions.VehicleException;
import by.epam.training.zaycevigor.model.entity.Car;
import by.epam.training.zaycevigor.model.entity.Plane;
import by.epam.training.zaycevigor.model.entity.Station;
import by.epam.training.zaycevigor.model.entity.Train;
import by.epam.training.zaycevigor.model.entity.Vehicle;
import static com.sun.org.apache.bcel.internal.Repository.instanceOf;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Creator {

    private static final String PARSE_EXC = "Cannot parse string to integer";
    private static final String ASSIGMENT_FAIL = "Mistake while assign the vehicle values";
    private static final String CREATE_FAIL = "Mistake while create a vehicle";

    public static Station stationCreator(String values) throws VehicleException {
        Station station = new Station(objectsCount(values));
        for (int i = 0; i < values.length(); i++) {

            if (START_OF_LINE.equals(values.substring(i, i + 1))) {
                Vehicle vehicle = null;
                int numOfAssignments = 0;

                switch (values.substring(i + 1, i + 2)) {
                    case "C":
                        numOfAssignments = 4;
                        vehicle = new Car();
                        break;
                    case "T":
                        numOfAssignments = 5;
                        vehicle = new Train();
                        break;
                    case "P":
                        numOfAssignments = 5;
                        vehicle = new Plane();
                        break;
                    default:
                        throw new VehicleException(CREATE_FAIL);

                }

                int endPos = 0;

                int j = i + 1;
                while (values.substring(j, j + 1).matches(END_OF_LINE) || j < values.length()) {
                    int iterations = 0;
                    if (VALUES_DIVIDER.equals(values.substring(j, j + 1))) {
                        j++;
                        Map locofDiv = elemLocation(values, VALUES_DIVIDER, j);
                        Iterator it = locofDiv.entrySet().iterator();
                        Map.Entry entry = (Map.Entry) it.next();

                        int value = (int) entry.getValue();

                        if (entry.getKey().equals(-1)) {
                            Map locofEnd = elemLocation(values, END_OF_LINE, j - 1);
                            it = locofEnd.entrySet().iterator();
                            entry = (Map.Entry) it.next();
                            value = (int) entry.getValue();
                        }
                        //double loadCapasity, int passengerCapasity, double vehicleCost, double fuelUsage)
                        if (iterations <= numOfAssignments) {
                            switch (iterations) {
                                case 0:
                                    try {
                                        vehicle.setLoadCapasity(Double.parseDouble(values.substring(j, (int) entry.getValue())));
                                    } catch (NumberFormatException parceEx) {
                                        throw new VehicleException(PARSE_EXC);
                                    }
                                    break;
                                case 1:
                                    try {
                                        vehicle.setPassengerCapasity(Integer.parseInt(values.substring(j, (int) entry.getValue())));
                                    } catch (NumberFormatException parceEx) {
                                        throw new VehicleException(PARSE_EXC);
                                    }
                                    break;
                                case 2:
                                    try {
                                        vehicle.setVehicleCost(Double.parseDouble(values.substring(j, (int) entry.getValue())));
                                    } catch (NumberFormatException parceEx) {
                                        throw new VehicleException(PARSE_EXC);
                                    }
                                    break;
                                case 3:
                                    try {
                                        vehicle.setFuelUsage(Double.parseDouble(values.substring(j, (int) entry.getValue())));
                                    } catch (NumberFormatException parceEx) {
                                        throw new VehicleException(PARSE_EXC);
                                    }
                                    break;
                                case 4:
                                    if (vehicle instanceof Train) {
                                        try {
                                            ((Train) vehicle).setTrainCarCount(Integer.parseInt(values.substring(j, (int) entry.getValue())));
                                        } catch (NumberFormatException parceEx) {
                                            throw new VehicleException(PARSE_EXC);
                                        }

                                    } else if (vehicle instanceof Plane) {
                                        try {
                                            ((Plane) vehicle).setRunwayLength(Integer.parseInt(values.substring(j, (int) entry.getValue())));
                                        } catch (NumberFormatException parceEx) {
                                            throw new VehicleException(PARSE_EXC);
                                        }

                                    }
                                    break;
                                default:
                                    throw new VehicleException(ASSIGMENT_FAIL);
                            }
                            endPos = (int) entry.getValue() + 1;

                            iterations++;
                        }
                    } else {
                        j++;
                    }
                }
                i = endPos;
                station.add(vehicle);
            }

        }

        return station;
    }

    private static Map elemLocation(String string, String searchable, int start) {
        TreeMap position;
        position = new TreeMap<>();
        for (int i = start; i < string.length(); i++) {
            if (string.substring(i, i + 1).matches(searchable)) {
                position.put(0, i);
                return position;
            }
            if (string.substring(i, i + 1).matches(END_OF_LINE)) {
                break;
            }
        }
        position.put(-1, 0);
        return position;
    }

    private static int objectsCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(END_OF_LINE)) {
                count++;
            }
        }
        return count;
    }
}
