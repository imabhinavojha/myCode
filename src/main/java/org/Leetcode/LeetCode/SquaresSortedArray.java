package org.Leetcode.LeetCode;

import java.util.Arrays;

public class SquaresSortedArray {

	public static void main(String[] args) {
		int nums[] = {-4,-1,0,3,10};
		SquaresSortedArray ssa = new SquaresSortedArray();
		
		System.out.println(ssa.sortedSquares(nums));
	}

	public int[] sortedSquares(int[] nums) {
		int square = 0;
		int nums1[] = new int [nums.length];
		for (int i = 0; i < nums.length; i++) {
			nums1[i] = nums[i]*nums[i];		
		}
		Arrays.sort(nums1); 
		return nums1;

	}
}
