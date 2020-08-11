package com.datastructure.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingMapByValue {

    public static void main(String [] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("qwerty", 2);
        map.put("werty", 1);
        map.put("ruwerwe", 5);
        map.put("jgrijg", 8);
        map.put("erguwer", 4);

        System.out.println(map);

        Map<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
            collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1,
                LinkedHashMap::new));
        System.out.println(sortedMap);
    }
}
