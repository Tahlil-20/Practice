package com.algorithm;

import java.util.Arrays;

public class ArrayRotationUsingTempVariable {

    public static void main(String [] args){
        int [] arr = {3, 5, 7, 0,2, 6};
        int d= 4;
        leftRotate(arr, d);
    }

    private static void leftRotate(int[] arr, int d) {
        for(int i=1; i<=d; i++){
            int temp = arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
                System.out.println(Arrays.toString(arr));
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

}
