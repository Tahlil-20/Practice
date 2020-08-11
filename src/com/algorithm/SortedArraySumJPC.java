package com.algorithm;

import com.algorithm.model.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class SortedArraySumJPC {

    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7};
        int k = 5;
        findPairsInOneIteration(arr,k);
    }

    private static void findPairsInOneIteration(int[] arr, int k) {
        int n = arr.length;
        int mid = n/2;
        int i= 0;
        int j = n-1;
        List<Pair> pairs = new ArrayList<Pair>();
        while(i<mid && j>mid){
            int sum = arr[i]+arr[j];
            if(sum == k){
                System.out.println(arr[i]+" "+arr[j]);
                Pair pair = new Pair(arr[i],arr[j]);
                pairs.add(pair);
            }else if(sum>k){

            }
            i++;
            j--;
        }

    }
}
