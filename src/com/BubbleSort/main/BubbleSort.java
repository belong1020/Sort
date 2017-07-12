package com.BubbleSort.main;

/**
 *  BubbleSort
 * Created by Asus on 2017/07/11.
 */
public class BubbleSort {

    public static double[] bubbleSort(double[] array){
        double[] arrayCopy  =  new double[array.length];
        for( int i = 0; i < array.length; i++ ){
            arrayCopy[i] = array[i];
        }
        for(int i = 0; i < array.length-1; i++){
            for(int j = 0; j<array.length-1; j++){
                if(arrayCopy[j]>arrayCopy[j+1]){
                    arrayCopy[j] = arrayCopy[j+1] + arrayCopy[j] ;
                    arrayCopy[j+1] = arrayCopy[j] - arrayCopy[j+1];
                    arrayCopy[j] = arrayCopy[j] - arrayCopy[j+1];
                }
            }
            for(double j:arrayCopy)
                System.out.print(j+",");
            System.out.println();
        }
        return arrayCopy;

    }
    public static void main(String [] args){

        double[] array = bubbleSort(new double[]{5,2,4,8,6,3,9,7,1,0});
        /*
        for(double j:array)
            System.out.print(j+",");
        */
    }

}
