package com.paras;

public class max {
    public static void main(String[] args) {
        int[] arr={3,1,666,79,100};
        System.out.println(max(arr));
        System.out.println(min(arr));

    }


    static int max(int[] arr){
        int maxval=arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;

    }
    static int min(int[] arr) {
        int minval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minval) {
                minval = arr[i];
            }
        }
        return minval;
    }
}
