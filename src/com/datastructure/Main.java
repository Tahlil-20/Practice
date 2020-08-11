package com.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello Fan ki Tas tic World!");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println("the value of n: "+n);

        StringBuffer sb = new StringBuffer();

        for (int i = 0 ;i < n; i++) {
            String c = br.readLine();
            sb.append(c);
        }

        System.out.println("ans: "+ sb.toString());

        Map<String, Integer> pm = new HashMap<String, Integer>();
        pm.values();

    }
}
