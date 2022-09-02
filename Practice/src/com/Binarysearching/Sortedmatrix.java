//package com.Binarysearching;
//
//public class Sortedmatrix {
//    public static void main(String[] args) {
//
//    }
//
//    //search in the row
//    static int[] binarysearch(int[][] matrix,int row, int cStart,int cEnd,int target){
//        while(cStart<= cEnd){
//            int mid=cStart+(cEnd-cStart)/2;
//            if(matrix[row][mid]==target){
//                return new int[]{row,mid};
//            }
//            if(matrix[row][mid]<target){
//                cStart=mid+1;
//            }
//            else {
//                cEnd=mid-1;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//
//
//    static int[] search(int[][] matrix, int target){
//        int rows=matrix.length;
//        int cols=matrix[0].length;
//
//        if(rows==1){
//            return binarysearch(matrix,0,0,cols-1,target);
//        }
//
//        int rstart=0;
//        int rend=rows-1;
//        int cMid=cols/2;
//        //run the loop till 2 rowa are remaining
//        while(rstart<(rend-1)){ //while this is true it true it will have more than 2 rows
//
//        }
//    }
//}
