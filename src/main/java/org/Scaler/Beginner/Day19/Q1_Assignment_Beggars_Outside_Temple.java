package org.Scaler.Beginner.Day19;

import java.util.Arrays;

public class Q1_Assignment_Beggars_Outside_Temple {

	public static void main(String[] args) {
		int[][] B = { { 1, 2, 10 }, { 2, 3, 20 }, { 2, 5, 25 } };
		int A = 5;

		Q1_Assignment_Beggars_Outside_Temple BOT = new Q1_Assignment_Beggars_Outside_Temple();
		System.out.println(BOT.solve(A, B));
		System.out.println(BOT.solve1(A, B));
	}

	public int[] solve(int A, int[][] B) {
		int[] result = new int[A + 1];

		for (int i = 0; i < B.length; i++) {
			int amount = B[i][2];
			result[B[i][0] - 1] += amount;
			result[B[i][1]] -= amount;
		}
		for (int i = 1; i < A; i++) {
			result[i] += result[i - 1];
		}
		result = Arrays.copyOf(result, result.length - 1);
		System.out.println(Arrays.toString(result));
		return result;
	}

	public int[] solve1(int A, int[][] B) {
		int[] output = new int[A];
		int rows = B.length;

		// System.out.println("rows : "+ rows);
		// update the queries
		for (int i = 0; i < rows; i++) {
			int L = B[i][0] - 1; // -1 coz 1 based indexing
			int R = B[i][1] - 1; // -1 coz 1 based indexing
			int data = B[i][2];
			 System.out.println("solve1 L : " + L + " R: " + R + " data :" + data);

			// keep updating values in the output until N-1
			if (R < A - 1) {
				output[L] += data;
				output[R + 1] -= data;
			} else { // for last index A-1 // only update L
				output[L] += data;
			}
			System.out.println("solve1 Prefix Sum: " + Arrays.toString(output));
		}

		// output
		for (int i = 1; i < A; i++) // will start with 1 coz already covered 0 above
		{
			output[i] = output[i - 1] + output[i];
		}

		return output;
	}
}
