package by.epam.training.model.util;

import static by.epam.training.zaycevigor.constcontainer.Constants.FILE_PATH;
import static by.epam.training.zaycevigor.model.util.Parser.getStringArrayFromFile;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParserTest {

    public ParserTest() {
    }

    @Test
    public void getStringArrayFromFileTest() {
        System.out.println(getStringArrayFromFile(FILE_PATH));
        String expected = "first\nsecond ";

        assertEquals(expected, getStringArrayFromFile(FILE_PATH));
    }
}
