package edu.brainacad;

/**
 * Created by Admin on 15.03.2016.
 */
public class MyTest {

    public static <T extends Comparable>int calcNum(T[] arr,T elem){
        int count = 0;
        for(T arrayElement: arr){
            if (arrayElement.compareTo(elem)>0){
                count++;
            }

        }
        return count;

    }
}