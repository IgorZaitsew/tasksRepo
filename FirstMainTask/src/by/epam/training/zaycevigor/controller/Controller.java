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
import static by.epam.training.zaycevigor.input.Parser.getStringFromFile;
import static by.epam.training.zaycevigor.input.Validator.sizeValidate;
import static by.epam.training.zaycevigor.input.VectorCreator.createVector;
import static by.epam.training.zaycevigor.model.logic.VectorSorter.bubbleSort;
import static by.epam.training.zaycevigor.model.logic.MathCalculator.*;
import static by.epam.training.zaycevigor.model.logic.SearchClass.linearSearch;
import by.epam.training.zaycevigor.model.entity.Vector;
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

        int size = sizeValidate(getStringFromFile(FILE_PATH));
        Vector vector = new Vector(size);
        createVector(vector,  2, 5);

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
