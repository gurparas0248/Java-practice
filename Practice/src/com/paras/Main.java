package com.paras;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

//        //array of premetives
//        int arr[]=new int[5];
//
//        //input using for loop
//        for(int i=0;i<5;i++){
//            arr[i]=s.nextInt();
//        }
//        //output using for loop
//        for(int i=0;i<5;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//        for (int num : arr){
//            System.out.println(num+ " ");//here num represents element of the array
//        }

        //array of objects

        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=s.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
