/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.model.entity;

import static by.epam.training.zaycevigor.consts.Constants.ROUNDING_VALUE;
import by.epam.training.zaycevigor.exceptions.VectorException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Vector {

    public static final String OUT_OF_ARRAY_EXCEPTION_TEXT = "Out of array dimension";
    public static final String SAME_INDEX_EXCEPTION_TEXT = "Those two index has the same value";
    public static final int BASIC_SIZE = 10;
    private double[] array;
    private int count;

    public Vector() {
        array = new double[BASIC_SIZE];
        count = array.length;
    }

    public Vector(int size) {
        array = new double[size];
        count = array.length;
    }

    public void setNumber(double number, int index) throws VectorException {

        if (index < count) {
            array[index] = number;
        } else {
            throw new VectorException(OUT_OF_ARRAY_EXCEPTION_TEXT, array);
        }
    }

    /**
     *
     * @param index
     * @return
     */
    public double number(int index) throws VectorException {
        if (index < count) {
            return array[index];
        } else {
            throw new VectorException(OUT_OF_ARRAY_EXCEPTION_TEXT, array);
        }
    }

    public int length() {
        return array.length;
    }

    public double[] getVector() {
        return array;
    }

    //swaps values at first and second index
    public void transposition(int firstIndex, int secondIndex) throws VectorException {
        if (firstIndex == secondIndex) {
            throw new VectorException(SAME_INDEX_EXCEPTION_TEXT, array);
        }

        if (firstIndex >= 0 || secondIndex < array.length) {
            array[firstIndex] += array[secondIndex];
            array[secondIndex] = array[firstIndex] - array[secondIndex];
            array[firstIndex] -= array[secondIndex];
        } else {
            throw new VectorException(OUT_OF_ARRAY_EXCEPTION_TEXT, array);
        }
    }

    @Override
    public String toString() {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("#." + ROUNDING_VALUE, otherSymbols);
        df.setRoundingMode(RoundingMode.CEILING);

        StringBuilder vector = new StringBuilder();

        for (double element : array) {
            vector.append(df.format(element)).append("\n");
        }

        return vector.toString();
    }
}
