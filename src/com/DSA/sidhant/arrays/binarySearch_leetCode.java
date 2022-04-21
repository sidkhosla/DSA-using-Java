package com.DSA.sidhant.arrays;
//Given an array of integers nums which is sorted in ascending order, and an integer target,
// write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//
//You must write an algorithm with O(log n) runtime complexity.
//https://leetcode.com/problems/binary-search/
//-1,0,3,5,9,12
//9
public class binarySearch_leetCode {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        while(left<=right){
            int mid = (left + right)/2;

            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                left = mid + 1;
            }else if(target<nums[mid]){
                right = mid -1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 9;
        System.out.println(search(nums, target));
    }


}
