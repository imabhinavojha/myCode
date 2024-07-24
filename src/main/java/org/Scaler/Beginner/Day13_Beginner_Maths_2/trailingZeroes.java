package org.Scaler.Beginner.Day13_Beginner_Maths_2;

public class trailingZeroes {

	public static void main(String[] args) {
		trailingZeroes tz = new trailingZeroes();
		tz.toBinary(79438016);

	}

	public static int toBinary(int A) {
		StringBuilder binary = new StringBuilder(32);
		while (A > 0) {
			binary.append(A % 2);
			A >>= 1;
		}
		String y = binary.reverse().toString();
		int count = 0;
		for (int i = y.length() - 1; i >= 0; i--) {
			if (y.charAt(i) == '0') {
				count++;
			} else {
				break;
			}
		}
		return count;

	}
}
