/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.model.util;

import static by.epam.training.zaycevigor.model.util.ConstContainer.FILE_PATH;
import static by.epam.training.zaycevigor.model.util.Parser.getStringFromFile;
import static by.epam.training.zaycevigor.model.util.Validator.stringValidate;
import by.epam.training.zaycevigor.model.util.exceptions.SphereException;
import java.io.IOException;
import org.testng.annotations.Test;

/**
 *
 * @author Игорь
 */
public class ValidatorTest {
    
    public ValidatorTest() {
    }

   @Test
   public void stringValidateTest() throws IOException, SphereException{
       System.out.println(stringValidate(getStringFromFile(FILE_PATH)));
   }
}
