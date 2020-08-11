package com.algorithm;

import java.util.Arrays;

public class ArrayRotationLeastComplexity {

    public static void main(String [] args){
        int [] arr = {1, 2, 3, 4,5, 6,7,8,9,10,11,12};
        int d= 3;
        leftRotate(arr, d);
    }

    private static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        int gcd = gcd(n,d);
        for(int i=0; i<gcd; i++){
            int temp = arr[i];
            int j = i;
            while(true){
               int k=j+d;
               if(k>=n){
                   k=k-n;
               }
               if(k == i){
                   break;
               }
               arr[j] = arr[k];
               j=k;
            }
            arr[j]= temp;

        }

        System.out.println(gcd);
        System.out.println(Arrays.toString(arr));
    }

    private static int gcd(int n, int d) {
        if(d==0){
            return n;
        }else {
            return gcd(d, n%d);
        }
    }

}
