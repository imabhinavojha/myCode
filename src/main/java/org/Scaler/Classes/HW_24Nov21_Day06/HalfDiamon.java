package org.Scaler.Classes.HW_24Nov21_Day06;

import java.util.Scanner;

public class HalfDiamon {
	public static void main(String[] args) {
		int rows = 3;
		for (int i = 1; i <= rows; i++) {
			// Print space in decreasing order
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			// Print star in increasing order
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
