package org.Scaler.Classes.HW_29Nov21_Day08;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n+" * "+ i + " = " + n*i);
			
		}

	}

}
