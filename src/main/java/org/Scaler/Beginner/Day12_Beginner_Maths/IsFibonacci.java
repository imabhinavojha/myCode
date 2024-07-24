package org.Scaler.Beginner.Day12_Beginner_Maths;

import java.util.Scanner;

public class IsFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			int inputNumber = sc.nextInt();
			isFibonacci(inputNumber);
		}

	}

	static void isFibonacci(int inputNumber) {
		int firstTerm = 0;
		int secondTerm = 1;
		int thirdTerm = 0;

		while (thirdTerm < inputNumber) {
			thirdTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
		}

		if (thirdTerm == inputNumber) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
