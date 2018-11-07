/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.logic;

import by.epam.training.zaycevigor.exceptions.VectorException;

/**
 *
 * @author Igor Zaycev
 */
public class VectorSorter {

    public static void bubbleSort(Vector vector) throws VectorException {
        boolean isChange = true;

        while (isChange == true) {
            isChange = false;
            for (int i = 0; i < vector.length() - 1; i++) {
                if (vector.number(i) > vector.number(i + 1)) {
                    vector.transposition(i, i + 1);
                    isChange = true;
                }
            }

        }

    }

    public static void insertionSort(Vector vector) throws VectorException {
        Vector temp = new Vector(1);
        int j;

        for (int i = 0; i < vector.length() - 1; i++) {

            if (vector.number(i + 1) < vector.number(i)) {
                temp.setNumber(vector.number(i + 1), 0);
                vector.setNumber(vector.number(i), i + 1);
                j = i;

                while (j > 0 && temp.number(0) < vector.number(j - 1)) {
                    vector.setNumber(vector.number(j - 1), j);
                    j--;
                }
                vector.setNumber(temp.number(0), j);
            }
        }

    }

    public static void quickSort(Vector vector) throws VectorException {

        class Sort {

            public void doSort(Vector vector, int begin, int end) throws VectorException {
                if (begin >= end) {
                    return;
                }

                int i = begin, j = end, mid = i - (i - j) / 2;
                while (i < j) {

                    while (vector.number(i) <= vector.number(mid) && i < mid) {
                        i++;
                    }

                    while (vector.number(mid) <= vector.number(j) && j > mid) {
                        j--;
                    }

                    if (i < j) {
                        vector.transposition(i, j);
                        
                        if (i == mid) {
                            mid = j;
                        } else if (j == mid) {
                            mid = i;
                        }
                    }

                }
                doSort(vector, begin, mid);
                doSort(vector, mid + 1, end);
            }
        }

        Sort sort = new Sort();
        sort.doSort(vector, 0, vector.length() - 1);

    }

}
