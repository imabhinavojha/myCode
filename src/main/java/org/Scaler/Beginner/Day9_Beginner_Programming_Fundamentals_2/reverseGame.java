package org.Scaler.Beginner.Day9_Beginner_Programming_Fundamentals_2;

import java.util.Scanner;

public class reverseGame {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int input = sc.nextInt();
		reverseGame pi = new reverseGame();

		pi.name1(input);
	}
	
	

	public void name1(int input) {
		int arr[] = new int[input];
		for (int i = 0; i < input; i++) {
			arr[i]= sc.nextInt();
		}
		for (int j : arr) {
			name(j);
			
		}
	}

	public void name(int input) {
		int ans = 0;
		int last_digit = 0;
		for (; input != 0; input = input / 10) {
			last_digit = input % 10;
			ans = ans * 10 + last_digit;
		}
		System.out.print(ans);
	}

}
