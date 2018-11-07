/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.input;

import by.epam.training.zaycevigor.exceptions.VectorException;
import static by.epam.training.zaycevigor.input.Input.randomDoubleIn;
import by.epam.training.zaycevigor.logic.Vector;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Игорь
 */
public class InputTest {
    private Vector vector;
    
    public InputTest() {
        vector=new Vector(5);
    }
    
    @Test
    public void randomDoubleInTest() throws VectorException{
        
        for(int i=0;i<vector.length();i++){
            vector.setNumber(randomDoubleIn(2,5),i);
        }
        
        System.out.println(vector.toString());
    }

   
}
