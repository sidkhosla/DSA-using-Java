package com.DSA.sidhant.arrays;

public class binarySearch_nados {
    public int search(int[] nums, int target) {
        int left = 0 , right = nums.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid]){
                left = mid + 1;
            }else if(target < nums[mid]){
                right = mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {




        }
}
