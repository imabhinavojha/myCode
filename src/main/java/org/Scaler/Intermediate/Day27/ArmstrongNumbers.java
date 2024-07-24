package org.Scaler.Intermediate.Day27;

import java.util.Scanner;

public class ArmstrongNumbers {
	static boolean isArmstrong(int n) {
		int temp, digits = 0, last = 0, sum = 0;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (n == sum)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 1; i <= num; i++)
			if (i == 1) {
				if (isArmstrong(i))
					System.out.println(i);
			} else if (i > 9) {
				if (isArmstrong(i))
					System.out.println(i);
			}
	}
}