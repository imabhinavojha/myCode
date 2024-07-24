package org.Scaler.Beginner.Day13_Beginner_Maths_2;

import java.util.Scanner;

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D;
		D = B * B - 4 * A * C;
		if (D > 0) {
			System.out.println(1);
		}if (D == 0) {
			System.out.println(0);
		} else {
			System.out.println(-1);
		}
	}

}
