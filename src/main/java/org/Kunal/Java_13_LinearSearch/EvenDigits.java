package org.Kunal.Java_13_LinearSearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
	public static void main(String[] args) {
		int[] nums = { -12, 345, 2, 6, 7896 };
		System.out.println(findNumbers(nums));

		System.out.println(digits2(-345678));
		int f =  (int) (Math.log10(7896));
		System.out.println("dsf "+ (f+1) );

	}

	static int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (even(num)) {
				count++;
			}
		}
		return count;
	}

	// function to check whether a number contains even digits or not
	static boolean even(int num) {
		int numberOfDigits = digits2(num);
		/*
		 * if (numberOfDigits % 2 == 0) { return true; } return false;
		 */
		System.out.println(num+ " "+numberOfDigits);
		return numberOfDigits % 2 == 0;
	}

	static int digits2(int num) {
		if (num < 0) {
			num = num * -1;
		}
		return (int) (Math.log10(num)) + 1;
	}

	// count number of digits in a number
	static int digits(int num) {
		System.out.println(" num1 " +num);

		if (num < 0) {
			num = num * -1;
		}

		if (num == 0) {
			return 1;
		}

		int count = 0;
		System.out.println(" num2 " +num);
		while (num > 0) {
			count++;
			num = num / 10; // num /= 10
			System.out.println(" num3 " +num);

		}
		System.out.println(" count " +count);

		return count;
	}

}