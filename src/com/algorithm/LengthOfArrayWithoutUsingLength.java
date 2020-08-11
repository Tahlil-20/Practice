package com.algorithm;

public class LengthOfArrayWithoutUsingLength {
    public static void main(String [] args){

        int arr[] = {7,6,2,9,2,5};

        boolean end = false;
        int count =0;
        while(!end){
            try{
                int c = arr [count];
                System.out.println("not null : " + count);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("End of the array" + count);
                end = true;
            }
            count++;
        }
    }

}
