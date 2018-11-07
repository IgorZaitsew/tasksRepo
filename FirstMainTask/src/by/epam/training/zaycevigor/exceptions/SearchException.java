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
public class SearchException extends Exception {

    private Vector vector;

    public double[] getNumber() {
        return vector.getVector();
    }

    public SearchException(String message, Vector vector) {
        super(message);
        this.vector = vector;
    }

}
