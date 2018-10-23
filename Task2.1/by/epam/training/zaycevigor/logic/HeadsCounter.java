package com.by.epam.training.zaycevigor.logic;

public class HeadsCounter {
   public  HeadsCounter(){

    }
    public static int counting(int age){
        int headsCount=3,difference;
        headsCount+=(age>300)?(age-300+800):((age>200)?(age-200+600):age*3);
        return headsCount;
    }
}
