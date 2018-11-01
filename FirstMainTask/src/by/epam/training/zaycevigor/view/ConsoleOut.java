/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.view;

import org.apache.log4j.Logger;

/**
 *
 * @author Игорь
 */
public class ConsoleOut {
    private static Logger log = Logger.getLogger(ConsoleOut.class);
    public static void doubleOut(double number, String text) {
        System.out.println(text + number);
    }

    public static void arrayDoubleOut(double[] array, String text) {
        System.out.println(text);
        log.info(text);
        for (double i : array) {
            System.out.println(i);
            log.info(i);
        }
    }

    public static void boolOut(boolean condition, String textIfTrue, String textIfFalse) {
        if (condition) {
            System.out.println(textIfTrue);
            log.info(textIfTrue);
        } else {
            System.out.println(textIfFalse);
            log.info(textIfFalse);
        }
    }
}
