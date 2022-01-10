package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// find the minimum element in an array:
    int[] arr = {4,7,2,1,6};
    int n = arr.length;
        System.out.println(minRecur(arr,n));

    }
    public static int minRecur(int[] arr,int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1],minRecur(arr,n-1));
    }
}
/*
step 1.Recursively traverse the array from end:
step 2. so the base condition will be "if(n==1){
return arr[0];}
recursive call then return statement then print the returned statement:
 */
