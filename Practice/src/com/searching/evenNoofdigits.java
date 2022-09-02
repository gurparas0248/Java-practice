package com.searching;

public class evenNoofdigits {
    public static void main(String[] args) {
        int[] arr={12,123,1234,144,22};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }

    //function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberofdigits=digits(num);
        if(numberofdigits % 2 ==0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }

        return count;
    }

    //another way to find number of digits
    static int digits2(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }

    }
