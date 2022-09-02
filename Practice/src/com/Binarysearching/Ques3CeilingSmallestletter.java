package com.Binarysearching;

import java.util.Scanner;

public class Ques3CeilingSmallestletter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char[] arr={'c','d','r','f'};
        char target='f';
        System.out.println(BS(arr,target));
    }
    static int BS(char[] Letters,char target){


        int start=0;
        int end=Letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<Letters[mid]){
                end=mid-1;
            } else {
                start=mid+1;

            }

        }
        return (Letters[start % Letters.length]);
    }
}
