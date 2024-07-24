package org.Leetcode.LeetCode;

public class LinearSearch {
	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		int[] nums = {5};
		ls.search(nums, 5);

	}
	
	
//704. Binary Search
	int search(int[] nums, int target) {
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] == target) {
				System.out.println(i);
				return i;
			}
		}
		return -1;

	}
	
	
//278. First Bad Version


}