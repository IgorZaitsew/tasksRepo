package by.epam.training.zaycevigor.model.logic;

import by.epam.training.zaycevigor.exceptions.VehicleException;
import by.epam.training.zaycevigor.model.entity.Car;
import by.epam.training.zaycevigor.model.entity.Vehicle;
import by.epam.training.zaycevigor.model.entity.Station;
import static by.epam.training.zaycevigor.model.logic.VehicleSorter.sortByPassengerCapacity;
import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleSorterTest {

    public VehicleSorterTest() {
    }

    @Test
    public void sortByPassengerCapacityTest() throws VehicleException {
        Vehicle first = new Car(6, 4, 0.3, 12);
        Vehicle second = new Car(4, 3, 0.3, 12);
        Vehicle third = new Car(2, 1, 0.3, 12);
        Vehicle fourth = new Car(8, 5, 0.3, 12);
        Station container = new Station(4);
        container.set(first, 0);
        container.set(second, 1);
        container.set(third, 2);
        container.set(fourth, 3);
        sortByPassengerCapacity(container);
        System.out.println(container.toString());
        double[] expected = {2, 4, 6, 8};
        double[] result = {container.vehicle(0).loadCapasity(), container.vehicle(1)
            .loadCapasity(), container.vehicle(2).loadCapasity(),
            container.vehicle(3).loadCapasity()};

        assertArrayEquals(expected, result, 0.01);
    }
}
