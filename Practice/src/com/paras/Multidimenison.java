package com.paras;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.Scanner;

public class Multidimenison {
    public static void main(String[] args) {
        //syntax
        // int[][] arr = new int[][];
        Scanner in=new Scanner(System.in);

       // int[][] arr=new int[3][];

//        int[][] arr={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

        int[][] arr=new int[3][3];
        System.out.println(arr.length); //no of rows


        //input
        for(int row=0;row<arr.length;row++){
            //for each col in every row
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();

            }

        }
        //output
//        for(int row=0;row<arr.length;row++){
//            //for each col in every row
//            for(int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//
//            }
//            System.out.println();
//
//        }

        //also we can use
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
