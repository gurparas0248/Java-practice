package com.Binarysearching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={6,5,4,2,1};
        System.out.println(orderAgnosticBS(arr,2));
    }
    static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        //finding array is in ascending or descending
        boolean isAsc= arr[start]<arr[end];


        while (start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if (isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }

            }else{
                if(target>arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }




        }
        return -1;
    }
}
