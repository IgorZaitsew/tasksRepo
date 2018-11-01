/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.training.zaycevigor.logic;


public class MathCalculator {
    private double array[];
   private int count=0;
   
   public void setArray(double array[]){
       this.array=array;
       count=array.length;
   }  
   
    public double maxFinder(){
        double max=array[0];
        
        for(double i:array){
            if(max<i){
                max=i;
            }
        }
        
        return max;
    }
     
       public double minFinder(){ 
        double min=array[0];
       
        for(double i:array){
            if(min>i){
                min=i;
            }
        }
        
        return min;
    }
            
       public double average(){
           double averageValue=0;
           
           for(double i:array){
               averageValue+=i;
           }
           
           averageValue/=count;
           return averageValue;
       }
   
       public double geomMean(){
           double geomMeanValue=0;
           
           for(double i:array){
               geomMeanValue+=Math.log(i);
           }
           
           geomMeanValue=Math.exp(geomMeanValue/count);
           return geomMeanValue;
       }
       
       public boolean isSorted(){
           boolean sortStatus=true;
           for(int i=1;i<count;i++){
               
               if(array[i]<array[i-1]){
                   sortStatus =false;
                   break;
               }
               
           }
           
           return sortStatus;
       }
       
//       public int searchNum(){
//           int index;
//           
//           for()
//           
//           return index;
//       }
}
