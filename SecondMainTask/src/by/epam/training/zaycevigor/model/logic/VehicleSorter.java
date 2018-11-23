package by.epam.training.zaycevigor.model.logic;

import by.epam.training.zaycevigor.exceptions.VehicleException;
import by.epam.training.zaycevigor.model.entity.Station;

public class VehicleSorter {

    public static void sortByPassengerCapacity(Station container) throws VehicleException {
        Station temp = new Station(1);
        int j;

        for (int i = 0; i < container.count() - 1; i++) {

            if (container.vehicle(i + 1).passengerCapasity() < container.vehicle(i).passengerCapasity()) {
                temp.set(container.vehicle(i + 1), 0);
                container.set(container.vehicle(i), i + 1);
                j = i;

                while (j > 0 && temp.vehicle(0).passengerCapasity() < container.vehicle(j - 1).passengerCapasity()) {
                    container.set(container.vehicle(j - 1), j);
                    j--;
                }
                container.set(temp.vehicle(0), j);
            }
        }

    }
}
