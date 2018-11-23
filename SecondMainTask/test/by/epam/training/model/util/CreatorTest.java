/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.model.util;

import static by.epam.training.zaycevigor.constcontainer.Constants.FILE_PATH;
import by.epam.training.zaycevigor.exceptions.VehicleException;
import by.epam.training.zaycevigor.model.entity.Station;
import static by.epam.training.zaycevigor.model.util.Creator.stationCreator;
import static by.epam.training.zaycevigor.model.util.Parser.getStringArrayFromFile;
import static by.epam.training.zaycevigor.model.util.Validator.stringValidate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Игорь
 */
public class CreatorTest {

    public CreatorTest() {
    }

    @Test
    public void StationCreatorTest() throws VehicleException {
        Station station = stationCreator(stringValidate(getStringArrayFromFile(FILE_PATH)));
    }

}
