package org.Scaler.Classes.HW_29Nov21_Day08;

import java.util.Scanner;

public class InvertedNumericPyramid {

	public static void main(String[] args) {
		InvertedNumericPyramid in = new InvertedNumericPyramid();
		in.name1();
		

	}
	public void name1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(j);
				if (j<i) {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}
	public void name() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =n;
		for (int i = 1; i<= n; i++) {
			for (int j = 1; j <= count; j++) {
				System.out.print(j);
				
			}
			System.out.println();
			count = count-1;
			
		}
	}

}
