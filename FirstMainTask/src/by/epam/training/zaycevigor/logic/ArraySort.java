/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.logic;

/**
 *
 * @author Igor Zaycev
 */
public class ArraySort {

    public static double[] bubbleSort(double[] array) {
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    array[j] += array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                   array[j] -= array[j + 1];
                }

            }
        }

        return array;
    }

    public static double[] insertionSort(double[] array) {
    
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i + 1] < array[i]) {

                for (int j = i; j >= 0; j--) {

                    if ((array[i + 1] > array[j]) || (j == 0)) {
                        double temp = array[i + 1];

                        for (int k = j; k < i + 1; k++) {
                           array[k + 1] = array[k];
                        }

                       array[j] = temp;
                    }

                }

            }
        }

        return array;
    }

    public static double[] quickSort(double[] array) {

        class Sort {

            private double[] sortedArray;

            Sort(double[] sortedArray) {
                this.sortedArray = sortedArray;
            }

            public void doSort(int begin, int end) {
                int i = begin, j = end-1, mid = j / 2;
                while (i < j) {
                    while (i < mid && sortedArray[i] <= sortedArray[mid]) {
                        i++;
                    }
                    while (j > mid && sortedArray[j] >= sortedArray[mid]) {
                        j--;
                    }
                    if (i < j) {
                        sortedArray[j] += sortedArray[i];
                        sortedArray[i] = sortedArray[j] - sortedArray[i];
                        sortedArray[j] -= sortedArray[i];
                        if (i == mid) {
                            j = mid;
                        } else if (j == mid) {
                            i = mid;
                        }
                    }
                    doSort(begin,mid);
                    doSort(mid+1,end);
                }
            }
            
            public double[] getSortedArray(){
                return sortedArray;
            }
        }
        
        Sort sort=new Sort(array);
        sort.doSort(0, array.length);
        
        return sort.getSortedArray();
    }
}
