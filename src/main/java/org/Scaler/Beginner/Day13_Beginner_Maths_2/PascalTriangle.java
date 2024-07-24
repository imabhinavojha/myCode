package org.Scaler.Beginner.Day13_Beginner_Maths_2;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		int n = 5;
		for (int line = 1; line <= n; line++) {
			int C = 1;
			for (int i = 1; i <= line; i++) {
				System.out.print(C + " ");
				C = C * (line - i) / i;
			}
			System.out.println();
		}

	}
}
