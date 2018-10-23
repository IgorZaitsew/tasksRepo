package com.by.epam.training.zaycevigor.main;

import java.util.Scanner;

import static com.by.epam.training.zaycevigor.logic.HeadsCounter.counting;
import static com.by.epam.training.zaycevigor.view.ConsoleView.output;

public class Main {

    public static void main(String[] args) {
	int ageOfDragon;
        Scanner in = new Scanner(System.in);
        ageOfDragon = in.nextInt();
      output(counting(ageOfDragon));
    }
}
