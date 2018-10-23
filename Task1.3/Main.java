package com.company;

import com.logic.SquareFinder;
import com.sun.org.apache.bcel.internal.classfile.ConstantLong;
import com.view.ConsoleOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
    double rad1,rad2;
    rad1=in.nextDouble();
    rad2=in.nextDouble();
        SquareFinder finder = new SquareFinder();
        ConsoleOutput.output(finder.FindSquare(rad1)-finder.FindSquare(rad2));
    }
}
