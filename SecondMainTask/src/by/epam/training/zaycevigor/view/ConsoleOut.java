/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.view;

import static by.epam.training.zaycevigor.constcontainer.Constants.*;
import by.epam.training.zaycevigor.model.entity.Vehicle;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ConsoleOut {

    static final DecimalFormatSymbols OTHER_SYMBOLS = new DecimalFormatSymbols(Locale.US);
    static DecimalFormat df = new DecimalFormat("#.00" + ROUNDING_VALUE, OTHER_SYMBOLS);

    public static void doubleOut(double number, String text) {
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println(text + df.format(number));

    }

    public static void stringOut(String firstString, String secondString) {
        System.out.println(firstString + secondString);
    }

    public static void boolOut(boolean condition, String textIfTrue, String textIfFalse) {

        if (condition) {
            System.out.println(textIfTrue);
        } else {
            System.out.println(textIfFalse);
        }

    }

}
