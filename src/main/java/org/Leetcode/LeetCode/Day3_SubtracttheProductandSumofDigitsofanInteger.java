package org.Leetcode.LeetCode;

public class Day3_SubtracttheProductandSumofDigitsofanInteger {

	public static void main(String[] args) {
		Day3_SubtracttheProductandSumofDigitsofanInteger si = new Day3_SubtracttheProductandSumofDigitsofanInteger();
		int n = 234;
		System.out.println("d  " + si.subtractProductAndSum(n));
	}

	public int subtractProductAndSum(int n) {

		int sum = 0, mul = 1, min;
		while (n != 0) {

			sum = sum + n % 10;
			mul = mul * (n % 10);
			n = n / 10;

		}
		min = mul - sum;
		return min;

	}

}
