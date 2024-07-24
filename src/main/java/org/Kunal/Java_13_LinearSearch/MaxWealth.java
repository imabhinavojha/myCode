package org.Kunal.Java_13_LinearSearch;

//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
	public static void main(String[] args) {
		int[][] acc = { { 1, 2, 3 }, { 3, 2, 1 }, { 7, 3 }, { 1, 2 } };
		System.out.println(maximumWealth(acc));

	}

	static int maximumWealth(int[][] accounts) {

		int ans = Integer.MIN_VALUE;
		for (int[] ints : accounts) {
			System.out.println("Row " + ints);
			// when you start a new row, take a new sum for that row
			int sum = 0;
			for (int anInt : ints) {
				System.out.println("Col " + anInt);

				sum = sum + anInt;
			}
			System.out.println("sum " + sum);

			// now we have sum of accounts of person
			// check with overall ans
			if (sum > ans) {
				ans = sum;
			}
		}
		return ans;
	}
}