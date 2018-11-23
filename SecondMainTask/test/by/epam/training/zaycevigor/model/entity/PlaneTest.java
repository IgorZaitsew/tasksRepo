/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.model.entity;

import by.epam.training.zaycevigor.model.entity.Plane;
import by.epam.training.zaycevigor.model.entity.Vehicle;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Игорь
 */
public class PlaneTest {

    public PlaneTest() {

    }

    @Test
    public void toStringTest() {
        Vehicle plane = new Plane(70, 320, 120, 200, 2000);
        System.out.println(plane.toString());
    }

    /**
     * Test of equals method, of class Plane.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Plane instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Plane.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Plane instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Plane.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Plane instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
