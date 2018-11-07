/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.logic;

import by.epam.training.zaycevigor.exceptions.SearchException;
import by.epam.training.zaycevigor.exceptions.VectorException;
import static by.epam.training.zaycevigor.input.Input.randomDoubleIn;
import static by.epam.training.zaycevigor.logic.SearchClass.binarySearch;
import static by.epam.training.zaycevigor.logic.SearchClass.linearSearch;
import static by.epam.training.zaycevigor.logic.VectorSorter.insertionSort;
import static by.epam.training.zaycevigor.logic.VectorSorter.quickSort;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Игорь
 */
public class SearchClassTest {

    private Vector vector;

    public SearchClassTest() {
        vector = new Vector(10);
    }

    @Test
    public void linearSearchTest() throws VectorException {
        for (int i = 0; i < 10; i++) {
            vector.setNumber(randomDoubleIn(2, 3), i);
        }

        System.out.println(vector.toString() + "\n" + linearSearch(vector, 2.5D));

    }

    @Test
    public void binarySearchTest() throws VectorException, SearchException {
        for (int i = 0; i < 10; i++) {
            vector.setNumber(randomDoubleIn(2, 3), i);
        }
        quickSort(vector);
        System.out.println(vector.toString() + "\n" + binarySearch(vector, 2.5D));

    }
}
