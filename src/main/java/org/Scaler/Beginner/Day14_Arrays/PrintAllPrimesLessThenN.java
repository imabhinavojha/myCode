package org.Scaler.Beginner.Day14_Arrays;

import java.util.Scanner;

public class PrintAllPrimesLessThenN {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();

		if (m <= 0) {
			System.out.println("There are no prime numbers less than or equal to" + m);
		} else {
			printRange(m);
		}

	}

	static void printRange(int b) {
		for (int i = 2; i <= b; i++) {
			if (isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

	static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

}
