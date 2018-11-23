/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.view;

import static by.epam.training.zaycevigor.constcontainer.Constants.ROUNDING_VALUE;
import static by.epam.training.zaycevigor.view.ConsoleOut.df;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.apache.log4j.Logger;

public class LogOut {

    private static Logger log = Logger.getLogger(ConsoleOut.class);
    static final DecimalFormatSymbols OTHER_SYMBOLS = new DecimalFormatSymbols(Locale.US);
    static DecimalFormat df = new DecimalFormat("#." + ROUNDING_VALUE, OTHER_SYMBOLS);
    static DecimalFormat averageDF = new DecimalFormat("#.00" + ROUNDING_VALUE, OTHER_SYMBOLS);

    public static void doubleLogOut(double number, String text) {
        averageDF.setRoundingMode(RoundingMode.CEILING);
        log.info(text + averageDF.format(number));
    }

    public static void indent() {
        log.info("\n");
    }

    public static void boolIntLogOut(int number, String textIfTrue, String textIfFalse) {

        if (number != 0) {
            log.info(textIfTrue + number);
        } else {
            log.info(textIfFalse);
        }

    }

    public static void arrayDoubleLogOut(double[] array, String text) {
        log.info(text);

        for (double i : array) {
            log.info(i + " ");
        }

    }
}
