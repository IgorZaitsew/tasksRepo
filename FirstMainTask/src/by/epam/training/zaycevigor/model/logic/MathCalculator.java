/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.model.logic;

import by.epam.training.zaycevigor.model.entity.Vector;
import by.epam.training.zaycevigor.exceptions.VectorException;

public class MathCalculator {

    public static void reverse(Vector vector) throws VectorException {
        int size = vector.length();

        for (int i = 0; i < size / 2; i++) {
            vector.transposition(i, size - 1 - i);
        }

    }

    public static double maxFinder(Vector vector) throws VectorException {

        double max = vector.number(0);

        for (double i : vector.getVector()) {
            if (max < i) {
                max = i;
            }
        }

        return max;
    }

    public static double minFinder(Vector vector) throws VectorException {
        double min = vector.number(0);

        for (double i : vector.getVector()) {
            if (min > i) {
                min = i;
            }
        }

        return min;
    }

    public static double average(Vector vector) throws VectorException {
        double averageValue = 0;

        for (double i : vector.getVector()) {
            averageValue += i;
        }

        averageValue /= vector.length();
        return averageValue;
    }

    public static double geomMean(Vector vector) throws VectorException {
        double geomMeanValue = 0;

        for (double i : vector.getVector()) {
            geomMeanValue += Math.log(i);
        }

        geomMeanValue = Math.exp(geomMeanValue / vector.length());
        return geomMeanValue;
    }

    public static boolean isSorted(Vector vector) throws VectorException {
        boolean sortStatus = true;
        for (int i = 1; i < vector.length(); i++) {

            if (vector.number((i)) < vector.number(i - 1)) {
                sortStatus = false;
                break;
            }

        }

        return sortStatus;
    }

    public static int localMax(Vector vector) throws VectorException {

        for (int i = 0; i < vector.length(); i++) {

            if (i > 0 && i < vector.length() - 1) {
                if (vector.number(i) > vector.number(i - 1)
                        && vector.number(i) > vector.number(i + 1)) {
                    return i + 1;
                }
            } else if (i == 0) {
                if (vector.number(i) > vector.number(i + 1)) {
                    return i + 1;
                }

            } else {
                if (vector.number(i) > vector.number(i - 1)) {
                    return i + 1;
                }
            }

        }
        return 0;
    }
    
     public static int localMin(Vector vector) throws VectorException {

        for (int i = 0; i < vector.length(); i++) {

            if (i > 0 && i < vector.length() - 1) {
                if (vector.number(i) < vector.number(i - 1)
                        && vector.number(i) < vector.number(i + 1)) {
                    return i + 1;
                }
            } else if (i == 0) {
                if (vector.number(i) < vector.number(i + 1)) {
                    return i + 1;
                }

            } else {
                if (vector.number(i) < vector.number(i - 1)) {
                    return i + 1;
                }
            }

        }
        return 0;
    }
}
