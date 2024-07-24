package org.Scaler.Beginner.Day9_Beginner_Programming_Fundamentals_2;

import java.util.Scanner;

public class PrintthePrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int m = sc.nextInt();
		for (int i = n; i <= m; i++) {
			
			int div = 2;
			while (div <= i - 1) {
				if (i % div == 0) {
					break;
				}
				div = div + 1;
			}
			if (div == i) {
				System.out.println(i);
			}

		}

	}

}
