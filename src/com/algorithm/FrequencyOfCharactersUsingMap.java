package com.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharactersUsingMap {

    public static void main(String [] args){
        String str = "occurrance";
        char [] charArray = str.toCharArray();
        Map<Character, Integer> frequency = new HashMap<>();
        for(int i=0; i<charArray.length; i++){
            int count = frequency.containsKey(charArray[i]) ? frequency.get(charArray[i]) : 0;
            //
            //if(frequency.containsKey(charArray[i])) {
                frequency.put(charArray[i], count+1);
            //}
        }
        System.out.println(frequency);
    }
}
