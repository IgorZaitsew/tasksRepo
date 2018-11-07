/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.logic;

import by.epam.training.zaycevigor.exceptions.SearchException;
import by.epam.training.zaycevigor.exceptions.VectorException;
import static by.epam.training.zaycevigor.logic.MathCalculator.isSorted;
import static by.epam.training.zaycevigor.logic.VectorSorter.quickSort;
import java.util.Collections;

/**
 *
 * @author Igor Zaycev
 */
public class SearchClass {

    private final static String ARRAY_ISNT_SORTED = "Array isn't sorted";

    //search for the first in
    public static int linearSearch(Vector vector, double desiredValue) throws VectorException {
        for (int i = 0; i < vector.length(); i++) {
            if (vector.number(i) == desiredValue) {
                return i + 1;
            }
        }
        return 0;
    }

    public static int binarySearch(Vector vector, double desiredValue) throws VectorException, SearchException {
        if (isSorted(vector)) {

            Vector tempVector = vector;
            quickSort(tempVector);
            int low = 0, high = tempVector.length(), mid;
            while (low < high) {
                mid = (low + high) / 2;

                if (vector.number(mid) == desiredValue) {
                    return mid;
                } else if (vector.number(mid) > desiredValue) {
                    high = mid;
                } else {
                    low = mid + 1; 
                }
                
            }         
        } else {
            throw new SearchException(ARRAY_ISNT_SORTED, vector);
        }
        
        return 0;
    }
}
