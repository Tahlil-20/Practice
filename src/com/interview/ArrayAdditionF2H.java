package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAdditionF2H {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int n = s.nextInt();
        int a [] = new int[n];
        int b [] = new int[n];;
        int c [] = new int[n];;
        System.out.println("Enter all the elements for first array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Enter all the elements for second array:");
        for(int i = 0; i < n; i++)
        {
            b[i] = s.nextInt();
        }
        System.out.println("Enter all the elements for third array:");
        for(int i = 0; i < n; i++)
        {
            c[i] = s.nextInt();
        }
        int count = getNumberOfCombinations(n , a,b,c);
        System.out.println(count);

    }

    private static int getNumberOfCombinations(int n, int[] a, int[] b, int[] c) {
        int count =0;
        Arrays.sort(c);
        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(Arrays.binarySearch(c,a[i]+b[i])>=0){
                    count ++;
                }
            }
        }
        return count;
    }

}
