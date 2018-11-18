/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.input;

import static by.epam.training.zaycevigor.consts.Constants.ROUNDING_VALUE;
import by.epam.training.zaycevigor.exceptions.VectorException;
import by.epam.training.zaycevigor.model.entity.Vector;
import java.util.Random;

/**
 *
 * @author Igor Zaycev
 */
public class Input {


    public static double randomDoubleIn(double lowerCase, double upperCase) {
        double number;
        Random random = new Random();
        String format = "1" + ROUNDING_VALUE;

        number = lowerCase + random.nextDouble() * (upperCase - lowerCase);
        number = (double) Math.round(number * Integer.parseInt(format)) / Integer.parseInt(format);

        return number;
    }
}
