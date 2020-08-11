package com.algorithm;

public class PivotArray {
    public static void main(String [] args){

        int arr[] = {5,7,8,10,3};
        int n = arr.length;
        int pivot = findPivot(arr, 0, n-1);
        System.out.println(pivot);
        int key = 3;
        int val;
        if (pivot == -1)
           val =  binarySearch(arr, 0, n - 1, key);

        // If we found a pivot, then first
        // compare with pivot and then
        // search in two subarrays around pivot
        if (arr[pivot] == key)
            val = pivot;
        if (arr[0] <= key)
            val=  binarySearch(arr, 0, pivot - 1, key);
        val =  binarySearch(arr, pivot + 1, n - 1, key);

        System.out.println(val);

    }

    private static int findPivot(int[] arr, int low, int high) {
        //int low = 0; int high = arr.length-1;
        if(high < low){
            return  -1;
        }
        if(high == low){
            return low;
        }

        int mid = (high + low)/2; //3
        System.out.println(mid);
        if(mid<high && arr[mid]>arr[mid+1]){
            return mid;
        }
        if(mid>low && arr[mid]<arr[mid-1]){
            return mid-1;
        }
        if (arr[low] >= arr[mid]) {
            return findPivot(arr, low, mid - 1);
        }
        return findPivot(arr, mid + 1, high);

    }

    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

}
