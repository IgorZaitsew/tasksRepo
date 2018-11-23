/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.exceptions;

/**
 *
 * @author Игорь
 */
public class VehicleException extends Exception {

    private int index;

    public VehicleException(String message, int index) {
        super(message);
        this.index = index;
    }

    public VehicleException(String message) {
        super(message);
    }
}
