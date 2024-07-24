package org.Scaler.Intermediate.Day27;

import java.util.Scanner;

public class IsItPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i = 2;
		num = sc.nextInt();
		boolean flag = false;
		while (i <= num / 2) {
			System.out.println("while"+num/2);
			if (num % i == 0) {
				System.out.println("if"+num%i);

				flag = true;
				break;
			}
			++i;
		}
		if (!flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
