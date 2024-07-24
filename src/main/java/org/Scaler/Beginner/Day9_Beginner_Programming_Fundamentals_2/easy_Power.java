package org.Scaler.Beginner.Day9_Beginner_Programming_Fundamentals_2;


import java.util.Scanner;

public class easy_Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		int power = 1;
		for (int i = 1; i <= exponent; i++) {
			power = power * base;
		}
		System.out.println(power);
	}

}
