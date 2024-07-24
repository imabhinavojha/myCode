package org.Scaler.Beginner.Day9_Beginner_Programming_Fundamentals_2;

import java.util.Scanner;

public class palindromic_Integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		palindromic_Integer pi = new palindromic_Integer();
		pi.palindromicInteger(input);

	}

	public void palindromicInteger(int input) {
		int last_digit = 0, ans = 0;
		int copyInput = input;
		for (; input != 0; input = input / 10) {
			last_digit = input % 10;
			ans = ans * 10 + last_digit;
		}
		if (copyInput == ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");

		}

	}

	public void name(int input) {
		int ans = 0;
		int last_digit = 0;
		for (; input != 0; input = input / 10) {
			System.out.print(input + " ");
			last_digit = input % 10;
			ans = ans * 10 + last_digit;
		}
		System.out.println(" ");
		System.out.print(ans);
	}

	public void name1(int input) {
		int last_digit = 0;
		while (input != 0) {
			last_digit = input % 10;
			input = input / 10;
			System.out.print(last_digit);
		}

	}

}
