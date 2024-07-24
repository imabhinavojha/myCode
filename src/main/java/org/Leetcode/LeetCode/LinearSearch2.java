package org.Leetcode.LeetCode;

public class LinearSearch2 {
	public static void main(String[] args) {
		int[] num = { 1, 3, 5, 6 };
		searchInsert(num, 7);

	}

	static int searchInsert(int[] nums, int target) {
		// Last and First indexes
		int start = 0;
		int end = nums.length - 1;

		// Traverse an array
		while (start <= end) {

			int mid = (start + end) / 2;
			System.out.println("mid1 "+mid);

			// if target value found.
			if (nums[mid] == target) {
				System.out.println("mid "+mid);

				return mid;
			}

			// If target value is greater then mid elements's value
			else if (target > nums[mid]) {
				start = mid + 1;
				System.out.println("start "+start);

			}

			// otherwise target value is less,
			else {
				end = mid - 1;
				System.out.println("end "+end);

			}
		}
		// Return the insertion position
		return end + 1;

	}

}
