package com.searching;

import java.util.Arrays;

public class Searchin2darray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6,7},
                {8,9,66,11},
                {12,13,14}
        };
        int target=13;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(maximum(arr));
    }
    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
    static int maximum(int[][] arr){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }

        }
        return max;
    }
}
