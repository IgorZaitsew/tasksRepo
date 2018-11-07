/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.exceptions;

import by.epam.training.zaycevigor.logic.Vector;

/**
 *
 * @author Игорь
 */
public class VectorException extends Exception {

    private double[] array;

    public double[] getNumber() {
        return array;
    }

    public VectorException(String message, double[] arrayExc) {

        super(message);
       array = arrayExc;
    }

}
