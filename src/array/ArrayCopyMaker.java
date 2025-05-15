package array;

import java.util.Arrays;

/**
 *  Write a program to make a copy array from an array.
 *  I/P - a[] = {10,3,19,5,-1}
 *  O/P - copyArr = {10,3,19,5,-1}
 */
public class ArrayCopyMaker {
    public static  void  main(String[] args){
        int[] arr1={1,2,3};
        int[] b = new int[arr1.length];
        for(int i=0, j=0; i<arr1.length && j<b.length; i++){
            b[i]=arr1[i];
        }
      //return object dont use for int[]--- System.out.println(Arrays.asList(b));
        System.out.println(Arrays.toString(b));
    }


}
