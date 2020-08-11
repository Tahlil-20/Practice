package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InventoryProblem {

    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Data is for how many hours?");
        int n = s.nextInt();
        List<Integer> pastOrders = new ArrayList<Integer>();
        System.out.println("Enter all the hourly data:");
        for(int i = 0; i < n; i++)
        {
            pastOrders.add(s.nextInt());
        }
        Integer prediction = getOrderPrediction(pastOrders);
        System.out.println(prediction);
    }

    private static int getOrderPrediction(List<Integer> orders){
        Collections.sort(orders);
        int n = orders.size();
        int midVal = (n+1)/2;
        int median = 0;
       if(n%2 ==0){
           median = (orders.get(midVal-1) + orders.get(midVal))/2;
       }else{
           return median*12;
       }
        return median*12;
    }

}
