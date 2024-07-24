package org.Leetcode.LeetCode;

public class Day1_CountOddNumbersinanIntervalRange {

	public static void main(String[] args) {
		Day1_CountOddNumbersinanIntervalRange d1 = new Day1_CountOddNumbersinanIntervalRange();
		d1.countOdds(8, 10);
	}

	public int countOdds(int low, int high) {
		int count = 0;

//		for (int i = low; i <= high; i++) {
//			if (i % 2 != 0) {
//				count++;
//			}
//
//		}
		System.out.println("daf "+(high - low)/2);
		System.out.println("dafs "+(low % 2 + high % 2 > 0 ? 1 : 0));
		//(low % 2 + high % 2 > 0 ? 1 : 0)System.out.println(" "+ (high - low)/2 + (low % 2 + high % 2 > 0 ? 1 : 0));

		return count;

	}
}
