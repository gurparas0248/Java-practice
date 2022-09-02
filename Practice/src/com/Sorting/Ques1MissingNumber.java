package com.Sorting;

import java.util.Arrays;

class Ques1MissingNumber {
    public static void main(String[] args) {
        int[] arr={3,4,1,5,0};
        System.out.println(sort(arr));
    }

    static void swap(int[] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;


    }

    public static int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index){
                return index;
            }

        }
        return arr.length;
    }
}
