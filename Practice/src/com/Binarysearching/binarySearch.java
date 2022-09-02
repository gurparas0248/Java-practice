package com.Binarysearching;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,9};
        int target=s.nextInt();

        System.out.println(search(arr,target));
    }
    //returning index
    //return -1 if it does not exist
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;


            }
            else{
                return mid;
            }


        }
        return -1;


    }
}
