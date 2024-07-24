package org.Scaler.Beginner.Day14_Arrays;

public class areaOfCircle {

	public static void main(String[] args) {
		int r = 978;
		System.out.println(areaOfCircle.solve(r));
	}

	static int solve(int A) {
		double acos  = -1;
		float aoc = (float) ((Math.acos(acos) * A * A));
		System.out.println(aoc);
		int s = (int) Math.ceil(aoc);
		return s;

	}

}
