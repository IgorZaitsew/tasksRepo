/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.model.util;

import by.epam.training.zaycevigor.exceptions.VehicleException;
import static by.epam.training.zaycevigor.model.util.Validator.stringValidate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Игорь
 */
public class ValidatorTest {

    public ValidatorTest() {
    }

    @Test
    public void stringValidateTest() throws VehicleException {
        String s = "[C;-5;2;3;6]\n[D;1;2;3;4]\n[C;2;4;5;6]\n[F;1;1;1;1]\n[C;1;1;1;1]";
        s = stringValidate(s);
        System.out.println(s);
    }
}
