package org.Scaler.Classes.HW_25Nov21_Day07;

import java.util.Scanner;

public class divisibleByTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input%5==0 && input%11==0) {
			System.out.println("1");
			
		}else {
			System.out.println("0");
		}

	}

}
