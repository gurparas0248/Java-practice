package com.searching;

public class Searchinrange {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};

        System.out.println(Linear(arr,3,3,4));

    }
    static int Linear(int[] arr,int number,int start,int end){
        for(int i=start;i<=end;i++){
            if(arr[i]==number){
                return i;
            }

        }
        return -1;
    }
}
