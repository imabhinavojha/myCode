package org.Scaler.Beginner.Day13_Beginner_Maths_2;

public class TrailingZerosinFactorial {

	public static void main(String[] args) {
		System.out.println(findTrailingZeros(5));

	}

	static int findTrailingZeros(int n) {
		if (n < 0)
			return -1;
		int count = 0;
		for (int i = 5; n / i >= 1; i *= 5)
			count += n / i;
		return count;
	}

}
