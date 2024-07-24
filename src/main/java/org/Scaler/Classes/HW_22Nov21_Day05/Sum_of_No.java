package org.Scaler.Classes.HW_22Nov21_Day05;

import java.util.Scanner;

public class Sum_of_No {
	public static void main(String[] args) {

		int n, m, sum=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			m = sc.nextInt();
			sum=sum+m;
		}
		System.out.println(sum);			
			
	}
}
