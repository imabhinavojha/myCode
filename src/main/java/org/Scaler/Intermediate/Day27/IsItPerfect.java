package org.Scaler.Intermediate.Day27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsItPerfect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> cl = new ArrayList<>();

		int num = sc.nextInt();
		int sum = 0, i = 1;
		for (int j = 0; j < num; j++) {
			cl.add(sc.nextInt());
		}
		for (Integer n : cl) {
			System.out.println(isPerfect(n));
		}
	}

	static String isPerfect(int n) {
		if (n == 1)
			return "NO";
		int sum = 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n)
			return "YES";
		return "NO";
	}

}