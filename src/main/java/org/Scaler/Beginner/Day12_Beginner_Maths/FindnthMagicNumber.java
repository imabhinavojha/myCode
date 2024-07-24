package org.Scaler.Beginner.Day12_Beginner_Maths;

public class FindnthMagicNumber {

	public static void main(String[] args) {
		System.out.println(solve(3));

	}

	static int solve(int A) {
		int pow = 1, answer = 0;
		while (A != 0) {
			pow = pow * 5;
			if ((A & 1) == 1)
				answer += pow;
			A >>= 1;
		}
		return answer;
	}
}