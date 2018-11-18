package by.epam.training.zaycevigor.input;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Parser {

    public static String getStringFromFile(String filePath) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filePath));

        } catch (IOException e) {
            System.out.println("IOException");
        }
        return scanner.useDelimiter("\\Z").next();
    }

}
