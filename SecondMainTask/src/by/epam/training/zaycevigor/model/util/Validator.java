/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.model.util;

import static by.epam.training.zaycevigor.constcontainer.Constants.*;
import by.epam.training.zaycevigor.exceptions.VehicleException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Validator {

    public static String stringValidate(String unvalid) throws VehicleException {
        int checkedCount = objectsCount(unvalid);
        label:
        for (int i = 0; i < unvalid.length(); i++) {
            if (START_OF_LINE.equals(unvalid.substring(i, i + 1)) && checkedCount > 0) {
                i++;
                checkedCount--;
                for (int j = 0; j < CLASS_ID.length; j++) {

                    if (CLASS_ID[j].equals(unvalid.substring(i, i + 1))) {
                        break;
                    } else if (j == CLASS_ID.length - 1) {
                        for (int k = i + 1; k < unvalid.length() - 1; k++) {
                            if (END_OF_LINE.equals(unvalid.substring(k, k + 1))) {
                                unvalid = removeLine(unvalid, i, k);
                                i--;
                                continue label;
                            }
                        }
                    }
                }
                int j = i + 1, semicolonCount = 0;
                while (unvalid.substring(j, j + 1).matches(END_OF_LINE) || j < unvalid.length()) {

                    if (VALUES_DIVIDER.equals(unvalid.substring(j, j + 1))) {
                        j++;

                        Map locofDiv = elemLocation(unvalid, VALUES_DIVIDER, j);
                        Iterator it = locofDiv.entrySet().iterator();
                        Map.Entry entry = (Map.Entry) it.next();

                        int value = (int) entry.getValue();
                        if (entry.getKey().equals(-1)) {
                            Map locofEnd = elemLocation(unvalid, END_OF_LINE, j - 1);
                            it = locofEnd.entrySet().iterator();
                            entry = (Map.Entry) it.next();
                            value = (int) entry.getValue();
                        }

                        if (!(unvalid.substring(j, value).matches("([+]?[0-9]+(\\.[0-9]+)?)+")
                                || unvalid.substring(j, value).matches("^[+]?\\d+"))) {
                            Map locofEnd = elemLocation(unvalid, END_OF_LINE, j);
                            it = locofEnd.entrySet().iterator();
                            entry = (Map.Entry) it.next();

                            unvalid = removeLine(unvalid, i, (int) entry.getValue());
                            i--;

                            continue label;
                        } else if (unvalid.substring(value, value + 1).matches(END_OF_LINE)) {
                            i--;

                            continue label;
                        } else {
                            j++;
                        }

                    } else {
                        if (unvalid.substring(j, j + 1).matches(END_OF_LINE)) {
                            i--;
                            continue label;
                        }
                        j++;
                    }
                }
            }
        }
        return unvalid;
    }

    private static String removeLine(String string, int start, int end) {
        if (start != 0) {
            string = string.substring(0, start - 1) + string.substring(end + 1, string.length());
        } else {
            string = string.substring(end + 1, string.length());
        }
        return string;
    }

    private static Map elemLocation(String string, String searchable, int start) {
        TreeMap position;
        position = new TreeMap<>();
        for (int i = start; i < string.length(); i++) {
            if (string.substring(i, i + 1).matches(searchable)) {
                position.put(0, i);
                return position;
            }
            if (string.substring(i, i + 1).matches(END_OF_LINE)) {
                break;
            }
        }
        position.put(-1, 0);
        return position;
    }

    private static int objectsCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(END_OF_LINE)) {
                count++;
            }
        }
        return count;
    }
}
