package com.algorithm;

import java.util.Arrays;

public class ArrayRotationUsingTempArray {

    public static void main(String [] args){
        int [] arr = {3, 5, 7, 0,2, 6};
        int d= 4;
        leftRotate(arr, d);
    }

    private static void leftRotate(int[] arr, int d) {
        int n =arr.length;
        int [] tempArray = new int[d];
        for(int i = 0; i<d; i++){
            tempArray[i] = arr[i];
        }
        int z = d; // z = 6-4+1 =

        for(int j=0; j<d; j++){
            if(z<n){
                arr[j] = arr[z];
                z++;
            }
        }
        int i =0;
        for(int k = n-d; k<n; k++){
                arr[k] = tempArray[i];
                i++;
            //}
        }

        System.out.println(Arrays.toString(arr));
    }

}
