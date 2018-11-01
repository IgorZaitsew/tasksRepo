/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.controller;

import static by.epam.training.zaycevigor.consts.Constants.*;
import static by.epam.training.zaycevigor.view.ConsoleOut.*;
import static by.epam.training.zaycevigor.input.Input.randomDoubleIn;
import static by.epam.training.zaycevigor.logic.ArraySort.bubbleSort;
import by.epam.training.zaycevigor.logic.MathCalculator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author Igor Zaycev
 */
public class Controller {

    public static void main(String[] args) {
        double[] array=null;
        try {
             Scanner n = new Scanner(new File("E:\\GitFolder\\MainTask1\\ArrayDimension.txt"));
            array = randomDoubleIn(n.nextInt(), 2, 4);
        } catch (IOException e) {
             System.out.println( "IOException" );
        }
        
        MathCalculator calculator = new MathCalculator();
       
        calculator.setArray(array);

        arrayDoubleOut(array, BASIC_ARRAY);
        doubleOut(calculator.minFinder(), MIN);
        doubleOut(calculator.maxFinder(), MAX);
        doubleOut(calculator.average(), AVERAGE);
        doubleOut(calculator.geomMean(), GEOM_MEAN);
        boolOut(calculator.isSorted(), SORT_TRUE, SORT_FALSE);
        arrayDoubleOut(bubbleSort(array), SORTED_ARRAY);
        boolOut(calculator.isSorted(), SORT_TRUE, SORT_FALSE);

    }
}
