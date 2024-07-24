package org.Leetcode.LeetCode;

public class Day3_Numberof1Bits {

	public static void main(String[] args) {
		Day3_Numberof1Bits nb = new Day3_Numberof1Bits();
		int n = 00000000000000000000000000001011;
		nb.hammingWeight(n);

	}

	public int hammingWeight(int n) {

		int ones = 0;
		while (n != 0) {
			System.out.print(" "+(n & 1));
			ones = ones + (n & 1);
			n = n >>> 1;
			//System.out.print(" "+n);

		}
		//System.out.println(ones);
		return ones;
	}
}