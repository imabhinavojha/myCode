package org.Scaler.Classes.HW_29Nov21_Day08;

import java.util.Scanner;

public class CharactersStairPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		for (int i = 1; i <=data; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print((char)(i+64));	
				if (j<i) {
					System.out.print(" ");
				}
			}
			System.out.println();			
		}

	}

}
