package org.Scaler.Intermediate.Day27;

public class Factorial {
	public static void main(String[] args) {
		long start = System.nanoTime();
		int n = 100, count = 0;
		fact(n, count);
		long end = System.nanoTime();
		long execution = end - start;
		System.out.println("Execution time: " + execution + " nanoseconds");

	}

	static void fact(int n, int count) {
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				if (i == n % i) {
					count++;
				} else {
					count = count + 2;
				}

			}

		}
		System.out.println(count);
	}

	static void fact1(int n, int count) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}

		}
		System.out.println(count);
	}

}
