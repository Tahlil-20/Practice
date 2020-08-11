package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayPairs {

    //n = 9
    // {2,1,7,3, 6}
 // 2 -> 0
 // 1 -> 1
 // 7 -> (keysets(contains(n-i)))
    public static List<Integer> getIndexes(int [] arr, int n){

        Map<Integer, Integer> noToIndex = new HashMap<>();
        List<Integer> pairs= new ArrayList();
        for(int i=0; i<arr.length; i++){
            if(!noToIndex.containsKey(n - arr[i])){
                noToIndex.put(arr[i], i); //2, 0 // 1 , 1// 7
            }else{
                pairs.add(i);
                pairs.add(noToIndex.get(n-arr[i]));
            }
        }
        return pairs;
    }

    //{2,0,0,1,0,7,3,0,6}
    // {2,1,7,3,6, 0,0,0,0}
    // count =
    // 2- 0 insert position
    public static void separateZerosAndNonZeros(int [] arr){
        int insertPosition =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[insertPosition]=arr[i];
                ++insertPosition;
            }
        }
        for(int i = insertPosition; i<arr.length; i++){
            arr[i] =0;
        }
    }





}
