package org.Scaler.Classes.HW_29Nov21_Day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Sumthedigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int digit, sum = 0;
		ArrayList<Integer> results = new ArrayList<Integer>();
		for (int i = 1; i <= count; i++) {
			int g = sc.nextInt();
			results.add(g);
		}
		for (Object object : results) {
			int n = (int) object;
			while (n > 0) {
				digit = n % 10;
				sum = sum + digit;
				n = n / 10;

			}
			System.out.println(sum);
			sum = 0;
		}
		sc.close();

	}

}
