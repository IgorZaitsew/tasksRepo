/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.input;

import java.util.Random;

/**
 *
 * @author Igor Zaycev
 */
public class Input {

    public static double[] randomDoubleIn
        (int size, double lowerCase, double upperCase) {
            
        Random random = new Random();
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
         
            array[i]=lowerCase+random.nextDouble()*(upperCase-lowerCase);
        }
        
        return array;
    }
}
