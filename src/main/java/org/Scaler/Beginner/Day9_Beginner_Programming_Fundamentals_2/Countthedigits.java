package org.Scaler.Beginner.Day9_Beginner_Programming_Fundamentals_2;

import java.util.Scanner;

public class Countthedigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int arr[] = new int[input1];
		for (int i = 0; i < input1; i++) {
			arr[i] = sc.nextInt();

		}
		for (int j : arr) {
			int count = 0;
			for (; j != 0; j /= 10, ++count) {
			}
			System.out.println(count);
		}
	}

}
