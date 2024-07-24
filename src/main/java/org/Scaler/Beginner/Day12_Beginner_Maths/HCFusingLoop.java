package org.Scaler.Beginner.Day12_Beginner_Maths;

import java.util.Scanner;

public class HCFusingLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			HCF(num1, num2);
		}
	}

	static void HCF(int num1, int num2) {
		int i, hcf = 0;
		for (i = 1; i <= num1 || i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				hcf = i;
		}
		System.out.println(hcf);
	}

}
