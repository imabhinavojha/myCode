package org.Scaler.Classes.HW_29Nov21_Day08;

import java.util.Scanner;

public class Prime {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Prime p = new Prime();
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		printRange(n, m);
		
		//String output = isPrime(n)? "Yes Prime--" : "Not Prime--";
		//System.out.println(output);

		/*if (isPrime(n)) {
			System.out.println("Prime--");
		} else {
			System.out.println("Not Prime--");
		}*/
	}
	
	static void printRange(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (isPrime(i)) {
				System.out.println(i+" Prime");
			} 		}
	}
	
	static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public void range() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = n; i <= m; i++) {

			int div = 2;
			while (div <= i - 1) {
				if (i % div == 0) {
					System.out.println(i + " Not Prime");
					break;
				}
				div = div + 1;
			}
			if (div == i) {
				System.out.println(i + "Prime");
			}

		}

	}

	public void name1() {
		int n = sc.nextInt();
		int div = 2;
		while (div <= n - 1) {
			if (n % div == 0) {
				System.out.println(" Not Prime");
				break;
			}
			div = div + 1;
		}
		if (div == n) {
			System.out.println("Prime");
		}
	}

}
