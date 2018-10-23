package by.epam.training.zaycevigor.main;


import static by.epam.training.zaycevigor.logic.Counter.ifHead;
import static by.epam.training.zaycevigor.logic.Counter.ifTail;
import static by.epam.training.zaycevigor.logic.Counter.getHead;
import static by.epam.training.zaycevigor.logic.Counter.getTail;
import static by.epam.training.zaycevigor.logic.HeadsOrTailsDefiner.getHeadOrTailBoolean;
import static by.epam.training.zaycevigor.view.ConsoleOutput.output;

public class Main {

    public static void main(String[] args) {
        int flippingCount=1000;
    for(int i=0;i<flippingCount;i++){
        if(getHeadOrTailBoolean()==true){
            ifHead();
        }else{
            ifTail();
        }
    }
    output(getHead(),getTail());
    }
}
