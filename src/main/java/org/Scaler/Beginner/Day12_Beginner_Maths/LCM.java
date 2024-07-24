package org.Scaler.Beginner.Day12_Beginner_Maths;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int i;
		int a = (x > y) ? x : y;
//		System.out.println(a);
		for (i = a; i <= x * y; i = i + a) {
//			System.out.println("i "+i);
			if (i % x == 0 && i % y == 0)
				break;
		}
		System.out.println(i);

	}
}
