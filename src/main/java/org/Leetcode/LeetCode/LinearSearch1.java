package org.Leetcode.LeetCode;

import java.util.Iterator;

public class LinearSearch1 {

	// 278. First Bad Version

	public static void main(String[] args) {
		System.out.println(firstBadVersion(5));
		System.out.println(isBadVersion(4));

	}

	static int firstBadVersion(int n) {
		int low = 1, high = n, mid;
		int ans = -1;
		while (low <= high) {
			mid = low + ((high - low) / 2);
			System.out.println("mid " + mid);
			if (isBadVersion(mid)) {
				high = mid - 1;
				System.out.println("high " + high);

				ans = mid;
				System.out.println("ans " + ans);

			} else
				low = mid + 1;
			System.out.println("low " + low);

			
		}
		return ans;

	}

	static Boolean isBadVersion(int num) {
		Boolean Value;
		switch (num) {
		case 1: {
			Value = false;
		}
		case 2: {
			Value = false;
		}
		case 3: {
			Value = false;
		}
		case 4: {
			Value = true;
		}
		case 5: {
			Value = true;
		}

		default:
			return true;
		}

	}

}
