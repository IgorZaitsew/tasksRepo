/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.model.logic;

import by.epam.training.zaycevigor.model.entity.Vector;
import by.epam.training.zaycevigor.exceptions.VectorException;
import static by.epam.training.zaycevigor.input.Input.randomDoubleIn;
import static by.epam.training.zaycevigor.model.logic.MathCalculator.*;
import static by.epam.training.zaycevigor.model.logic.VectorSorter.bubbleSort;
import static by.epam.training.zaycevigor.model.logic.VectorSorter.quickSort;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Игорь
 */
public class MathCalculatorTest {

    private Vector vector;

    public MathCalculatorTest() {
        vector = new Vector(10);
    }

    @Test
    public void reverseTest() throws VectorException {
        for (int i = 0; i < 10; i++) {
            vector.setNumber(randomDoubleIn(-5, 5), i);
        }
        double temp[] = vector.getVector();

        reverse(vector);

        reverse(vector);
        assertArrayEquals(temp, vector.getVector(), 0.001);
    }

    @Test
    public void isSortedTest() throws VectorException {
        for (int i = 0; i < 10; i++) {
            vector.setNumber(randomDoubleIn(-5, 5), i);
        }
        bubbleSort(vector);
        System.err.println(isSorted(vector));
    }

    @Test
    public void localMaxTest() throws VectorException {
        for (int i = 0; i < 10; i++) {
            vector.setNumber(randomDoubleIn(-5, 5), i);
        }

        System.out.println(vector.toString());
        System.err.println(localMax(vector));
    }

    @Test
    public void localMinTest() throws VectorException {
        for (int i = 0; i < 10; i++) {
            vector.setNumber(randomDoubleIn(-5, 5), i);
        }

        System.out.println(vector.toString());
        System.err.println(localMin(vector));
    }
}
