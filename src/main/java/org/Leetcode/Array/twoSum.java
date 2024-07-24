package org.Leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

	public static void main(String[] args) {
		twoSum ts = new twoSum();
		int[] arr = { 2, 5, 5, 11 };
		int target = 10;
		int[] newarr = ts.twoSum1(arr, target);
		for (int i : newarr) {
			System.out.print(i+" ");
		}

	}

	public int[] twoSum(int[] nums, int target) {
		int arr[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target && i != j) {
					arr[0] = i;
					arr[1] = j;
				}
			}
		}
		return arr;

	}

	public int[] twoSum1(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int  complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[]{map.get(complement),i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
