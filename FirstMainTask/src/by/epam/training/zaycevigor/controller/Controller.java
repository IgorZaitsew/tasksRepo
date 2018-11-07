/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.controller;

import static by.epam.training.zaycevigor.consts.Constants.*;
import by.epam.training.zaycevigor.exceptions.VectorException;
import static by.epam.training.zaycevigor.view.ConsoleOut.*;
import static by.epam.training.zaycevigor.input.Input.randomDoubleIn;
import static by.epam.training.zaycevigor.input.Input.randomDoubleVectorIn;
import static by.epam.training.zaycevigor.logic.VectorSorter.bubbleSort;
import static by.epam.training.zaycevigor.logic.MathCalculator.*;
import static by.epam.training.zaycevigor.logic.SearchClass.linearSearch;
import by.epam.training.zaycevigor.logic.Vector;
import static by.epam.training.zaycevigor.view.LogOut.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Igor Zaycev
 */
public class Controller {

    public static void main(String[] args) throws VectorException {
        Vector vector;
        Scanner n = null;

        try {
            n = new Scanner(new File("E:\\GitFolder\\MainTask1\\ArrayDimension.txt"));

        } catch (IOException e) {
            System.out.println("IOException");
        }

        int size = n.nextInt();
        vector = randomDoubleVectorIn(2, 4, size);

        stringOut(BASIC_ARRAY, vector.toString());
        stringLogOut(BASIC_ARRAY, vector);

        doubleOut(minFinder(vector), MIN);
        doubleLogOut(minFinder(vector), MIN);

        doubleOut(maxFinder(vector), MAX);
        doubleLogOut(maxFinder(vector), MAX);

        doubleOut(average(vector), AVERAGE);
        doubleLogOut(average(vector), AVERAGE);

        doubleOut(geomMean(vector), GEOM_MEAN);
        doubleLogOut(geomMean(vector), GEOM_MEAN);

        boolOut(isSorted(vector), SORT_TRUE, SORT_FALSE);
        boolLogOut(isSorted(vector), SORT_TRUE, SORT_FALSE);

        reverse(vector);
        stringOut(REVERSE_ARRAY, vector.toString());
        stringLogOut(REVERSE_ARRAY, vector);
        reverse(vector);

        bubbleSort(vector);
        stringOut(SORTED_ARRAY, vector.toString());
        stringLogOut(SORTED_ARRAY, vector);

        boolOut(isSorted(vector), SORT_TRUE, SORT_FALSE);
        boolLogOut(isSorted(vector), SORT_TRUE, SORT_FALSE);

        boolIntOut(linearSearch(vector, 2.5D), DESIRED_ELEMENT, NO_DESIRED_ELEMENT);
        boolIntLogOut(linearSearch(vector, 2.5D), DESIRED_ELEMENT, NO_DESIRED_ELEMENT);

        indent();
    }
}
