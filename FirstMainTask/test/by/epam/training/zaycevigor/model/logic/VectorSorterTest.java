/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.model.logic;

import by.epam.training.zaycevigor.model.entity.Vector;
import static org.junit.Assert.*;
import static by.epam.training.zaycevigor.model.logic.VectorSorter.*;
import by.epam.training.zaycevigor.exceptions.VectorException;
import static by.epam.training.zaycevigor.input.Input.randomDoubleIn;
import static by.epam.training.zaycevigor.model.logic.MathCalculator.isSorted;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

/**
 *
 * @author Игорь
 */
public class VectorSorterTest {

    private Vector vector;
    private double[] temp;
    private static final int elementsCount = 10;
    private static final int valuesFrom = -10;
    private static final int valuesTo = 10;

    public VectorSorterTest() {
        vector = new Vector(elementsCount);
        temp = new double[elementsCount];
    }

    @Test
    public void bubbleSortTest() throws VectorException {

        for (int i = 0; i < elementsCount; i++) {
            double tempValue = randomDoubleIn(valuesFrom, valuesTo);
            vector.setNumber(tempValue, i);
            temp[i] = tempValue;
        }

        bubbleSort(vector);
        Arrays.sort(temp);
        assertArrayEquals(temp, vector.getVector(), 0.0001);
    }

    @Test
    public void insertionSortTest() throws VectorException {

        for (int i = 0; i < elementsCount; i++) {
            double tempValue = randomDoubleIn(valuesFrom, valuesTo);
            vector.setNumber(tempValue, i);
            temp[i] = tempValue;
        }

        insertionSort(vector);
        Arrays.sort(temp);
        assertArrayEquals(temp, vector.getVector(), 0.0001);
    }

    @Test
    public void quickSortTest() throws VectorException {
        for (int i = 0; i < elementsCount; i++) {
            double tempValue = randomDoubleIn(valuesFrom, valuesTo);
            vector.setNumber(tempValue, i);
            temp[i] = tempValue;
        }
        System.out.println(vector.toString());
        quickSort(vector);
        System.out.println(vector.toString());
        System.out.println(isSorted(vector));
        Arrays.sort(temp);
        assertArrayEquals(temp, vector.getVector(), 0.0001);

    }
}
