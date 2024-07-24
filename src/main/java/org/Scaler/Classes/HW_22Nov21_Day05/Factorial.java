package org.Scaler.Classes.HW_22Nov21_Day05;

public class Factorial {
	public static void main(String[] args) {
		int n1 = 4;
		System.out.println(factorial1(n1));

	}

	static int factorial1(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

	static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}
}
