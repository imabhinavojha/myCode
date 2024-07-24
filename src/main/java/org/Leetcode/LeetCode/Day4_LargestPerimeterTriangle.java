package org.Leetcode.LeetCode;

import java.util.Arrays;

public class Day4_LargestPerimeterTriangle {

	public static void main(String[] args) {
		Day4_LargestPerimeterTriangle lpt = new Day4_LargestPerimeterTriangle();
		int[] num = { 1,2,1,10 };
		System.out.println(lpt.largestPerimeter(num));

	}

	public int largestPerimeter(int[] nums) {
		int index = -1;

		for (int i = 0; i < nums.length; i++) {
			index = i;
			for (int j = i; j <= nums.length - 1; j++) {
				if (nums[j] < nums[index]) {
					index = j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[index];
			nums[index] = temp;
		}

		
		for (int i = nums.length - 1; i > 1; --i) {
			
			if (nums[i] < nums[i - 1] + nums[i - 2]) {
				return nums[i] + nums[i - 1] + nums[i - 2];
			}
		}
		return 0;
	}

}
