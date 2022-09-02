package com.Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {

        int[] arr={2,1,5,4,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] arr, int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;


    }

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);

            }else {
                i++;
            }
        }
    }
}
