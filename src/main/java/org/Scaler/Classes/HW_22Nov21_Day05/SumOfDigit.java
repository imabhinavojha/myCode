package org.Scaler.Classes.HW_22Nov21_Day05;

public class SumOfDigit {
	public static void main(String[] args) {
		int n = 123, rem, sum = 0;

		while (n != 0) {
			rem = n % 10;
			sum = sum + rem;
			System.out.println("sum in loop "+sum);
			n = n / 10;
		}
		System.out.println("sum " +sum);

	}
}
