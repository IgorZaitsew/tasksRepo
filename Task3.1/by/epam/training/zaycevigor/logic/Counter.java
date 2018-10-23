package by.epam.training.zaycevigor.logic;

public class Counter {
    private static int countHead=0,countTail=0;
    public static void ifHead(){
        countHead++;
    }
    public static void ifTail(){
        countTail++;
    }
    public static int getHead(){
       return countHead;
    }
    public static int getTail(){
        return countTail;
    }
}
