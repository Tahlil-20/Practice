package com.datastructure.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapNullKeyTwice {
    public static void main(String [] args){
        Map<String, Integer> map = new HashMap<>();

        map.put(null, 1);
        map.put(null , 4);

    }

}
