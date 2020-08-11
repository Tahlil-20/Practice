package com.algorithm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfDigitInPrimeNumbers {

    public static void main(String [] args){
        int startRange = 12;
        int endRange = 40;
        int maxFrequency = getMaxFrequencyOfDigitInPrimeNumbers(startRange, endRange);
        System.out.println(maxFrequency);


    }

    private static int getMaxFrequencyOfDigitInPrimeNumbers(int start, int end) {
        Map<Integer, Integer> frequencyMap = new HashMap();
        for(int i = start; i<=end; i++){
            int count = 0;
            int m = i/2;
            if(!(i==0 && i== 1)){
                for(int j=2; j<=m;j++){
                    if(i%j ==0){
                        count = count+1;
                        break;
                    }
                }
                if(count ==0){
                    int number = i;
                    while(number>0){
                        int digit = number%10;
                        Integer frequency = frequencyMap.get(digit);
                        if(frequency == null){
                            frequencyMap.put(digit, 1);
                        }else{
                            frequencyMap.put(digit, frequency+1);
                        }
                        number = number/10;
                    }

                }

            }

        }
        System.out.println(frequencyMap);

        return Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();
            //frequencyMap.entrySet().stream().max((e1, e2)-> e1.getValue()>e2.getValue()?1:-1).get().getKey();

    }


}

