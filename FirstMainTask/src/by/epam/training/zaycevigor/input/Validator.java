/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.input;

/**
 *
 * @author Игорь
 */
public class Validator {

    public static int sizeValidate(String unvalid) {
        StringBuilder valid = new StringBuilder();
        for (char symbol : unvalid.toCharArray()) {
            if (Character.isDigit(symbol)) {
                valid.append(symbol);
            }
        }
        return Integer.parseInt(valid.toString());
    }
}
