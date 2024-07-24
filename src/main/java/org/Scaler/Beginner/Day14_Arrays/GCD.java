package org.Scaler.Beginner.Day14_Arrays;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// GCD.gcd(a, b);
		GCD.gcd1(a, b);

	}

	static void gcd1(int a, int b) {
		int gcd = 1;

		if (a == 0 || b == 0) {
			if (a > b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		} else {

			for (int i = 1; i <= a && i <= b; ++i) {

				// check if i perfectly divides both n1 and n2
				if (a % i == 0 && b % i == 0)
					gcd = i;
			}
			System.out.println(gcd);
		}

	}

	static int gcd(int a, int b) {

		if (a == 0) {
			return b;

		} else if (b == 0) {

			return a;

		} else {
			while (a != b) {
				if (a > b)
					a = a - b;
				else
					b = b - a;
			}
		}
		return b;

	}

}
