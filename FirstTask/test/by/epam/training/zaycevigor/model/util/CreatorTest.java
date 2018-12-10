/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.model.util;

import by.epam.training.zaycevigor.model.entity.Sphere;
import static by.epam.training.zaycevigor.model.util.ConstContainer.FILE_PATH;
import static by.epam.training.zaycevigor.model.util.Creator.sphereArrayCreate;
import static by.epam.training.zaycevigor.model.util.Parser.getStringFromFile;
import static by.epam.training.zaycevigor.model.util.Validator.stringValidate;
import by.epam.training.zaycevigor.model.util.exceptions.SphereException;
import java.io.IOException;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Игорь
 */
public class CreatorTest {

    public CreatorTest() {
    }

    @Test
    public void sphereArrayCreateTest() throws IOException, SphereException {
        Sphere[] array;

        array = sphereArrayCreate(stringValidate(getStringFromFile(FILE_PATH)));
        for (Sphere arrayElem : array) {
            System.out.println("Sphere - " + arrayElem.toString() + "\n");
        }
    }
}
