package com.algorithm;

public class MaxTripletInArray {
    public static void main(String [] args){
        int a [] = {1,3,1,0,2,5,8};
        int n = a.length;
        int greatest_value_so_far = a[n- 1];
        int greatest_index = n- 1;
        int greater_on_right[] = new int[n];
        int smallest_value_so_far = a[0];
        int smallest_index = 0;
        int smallest_on_left[] = new int[n];
        for (int i = n -2; i >= 0; --i) {
            if (greatest_value_so_far > a[i]) {
                greater_on_right[i] = greatest_index;
            } else {
                greatest_value_so_far = a[i];
                greatest_index = i;
            }
        }
        for (int i = 0; i < n-2; ++i) {
            if (smallest_value_so_far > a[i]) {
                smallest_on_left[i] = smallest_index;
            } else {
                smallest_value_so_far = a[i];
                smallest_index = i;
            }
        }

        for (int i =0;i<n;++i) {
            if (greater_on_right[i] != -1 && smallest_on_left[i] != -1) {
                System.out.println(smallest_on_left[i] + ","+ i +","+ greater_on_right[i]);
            }
        }



    }

}
