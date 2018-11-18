/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.input;

import static by.epam.training.zaycevigor.consts.Constants.FILE_PATH;
import static by.epam.training.zaycevigor.input.Parser.getStringFromFile;
import org.junit.Assert;
import org.junit.Test;

public class ParserTest {

    @Test
    public void getStringFromTextTest() {
        String expected = "5";
        String result = getStringFromFile(FILE_PATH);
        Assert.assertEquals("5", getStringFromFile(FILE_PATH));
    }
}
