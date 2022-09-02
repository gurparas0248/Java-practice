package com.searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int number=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }


        System.out.println(Linear(arr,n,number));


    }
    static int Linear(int[] arr,int n,int number){
        for(int i=0;i<n;i++){
            if(arr[i]==number){
                return i;
            }

        }
        return -1;
    }
}
