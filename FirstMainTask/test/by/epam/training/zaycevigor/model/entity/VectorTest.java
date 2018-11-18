/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.model.entity;

import by.epam.training.zaycevigor.model.entity.Vector;
import by.epam.training.zaycevigor.exceptions.VectorException;
import static by.epam.training.zaycevigor.input.Input.randomDoubleIn;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Игорь
 */
public class VectorTest {

    private Vector vector;

    public VectorTest() {
        vector = new Vector(3);
    }

    @Test(expected = VectorException.class)
    public void setNumberTest() throws VectorException {

        vector.setNumber(3D, 0);
        vector.setNumber(2D, 1);
        vector.setNumber(1D, 2);
        vector.setNumber(0, 3);

    }

    @Test
    public void toStringTest() throws VectorException {
        vector.setNumber(3D, 0);
        vector.setNumber(2D, 1);
        vector.setNumber(1D, 2);
        double values[]={3,2,1};
        String temp="3.0\n2.0\n1.0 ";
                     
        assertEquals(temp,vector.toString());
    }

    @Test
    public void transpositionTest() throws VectorException {
        vector.setNumber(3.6, 0);
        vector.setNumber(2.0, 1);
        vector.setNumber(5.4, 2);
        double temp[]={2.0,3.6,5.4};
        
        for(int i=0;i<101;i++){
        vector.transposition(0, 1);
       }
        
        System.out.println(vector.toString());
        assertArrayEquals(temp, vector.getVector(), 0.001);
    }
}
