/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.logic;

/**
 *
 * @author Igor Zaycev
 */
public class SearchClass {
    public static int linearSearch(double[] array,int index){
        for(int i=0;i<array.length;i++){
            if(array[i]==index){
                return i+1;
            }
        }
        return 0;
    }   
}
