package org.Scaler.Beginner.Day12_Beginner_Maths;

import java.util.Scanner;

public class Findpower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int e = sc.nextInt();
		int power = 1;
		for (int i = 1; i <= e; i++) {
			power = power * base;
		}
		System.out.println(power);

	}

}
