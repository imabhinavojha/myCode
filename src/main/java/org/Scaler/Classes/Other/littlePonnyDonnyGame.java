package org.Scaler.Classes.Other;

import java.util.Scanner;

public class littlePonnyDonnyGame {

	public static void main(String[] args) {
		littlePonnyDonnyGame lt = new littlePonnyDonnyGame();
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		lt.solve(data);

	}

	public String solve(int A) {

		String name;
		if (A % 2 == 0) {
			name = "Donny";
			System.out.println(name);

		} else {
			name = "Ponny";
			System.out.println(name);
		}

		return name;

	}

}
