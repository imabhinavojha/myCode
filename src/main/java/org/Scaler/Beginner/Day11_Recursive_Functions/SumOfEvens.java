package org.Scaler.Beginner.Day11_Recursive_Functions;

public class SumOfEvens {

	public static void main(String[] args) {
		solve(5);
	}

	static int solve(int A) {
		int sum = 0;
		for (int i = 0; i <= A; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
