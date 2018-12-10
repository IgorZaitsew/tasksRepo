package by.epam.training.zaycevigor.model.util;

import by.epam.training.zaycevigor.model.util.exceptions.SphereException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Parser {

    private static final String WRONG_PATH = "Wrong file path";

    public static String getStringFromFile(String filePath) throws IOException {
        StringBuffer fromFile = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String s;
            while ((s = br.readLine()) != null) {

                fromFile.append(s).append("\n");
            }
        }
        return fromFile + " ";
    }

}
