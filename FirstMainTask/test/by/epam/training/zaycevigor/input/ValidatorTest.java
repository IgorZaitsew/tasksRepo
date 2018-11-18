/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.input;

import static by.epam.training.zaycevigor.consts.Constants.FILE_PATH;
import static by.epam.training.zaycevigor.input.Parser.getStringFromFile;
import static by.epam.training.zaycevigor.input.Validator.sizeValidate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Игорь
 */
public class ValidatorTest {
    
    public ValidatorTest() {
    }

    @Test
    public void sizeValidateTest(){
        int expected =5;
        int result = sizeValidate(getStringFromFile(FILE_PATH));
        assertEquals(expected,result);
    }
}
