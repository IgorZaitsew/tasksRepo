/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.input;

import by.epam.training.zaycevigor.exceptions.VectorException;
import static by.epam.training.zaycevigor.input.Input.randomDoubleIn;
import by.epam.training.zaycevigor.model.entity.Vector;

/**
 *
 * @author Игорь
 */
public class VectorCreator {

    public static void createVector(Vector vector, int lowerCase, int upperCase) throws VectorException {
        for (int i = 0; i < vector.length(); i++) {
            vector.setNumber(randomDoubleIn(lowerCase, upperCase), i);
        }

    }
}
