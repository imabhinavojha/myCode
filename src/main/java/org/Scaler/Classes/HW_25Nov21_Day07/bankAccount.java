package org.Scaler.Classes.HW_25Nov21_Day07;

import java.util.ArrayList;
import java.util.Scanner;

public class bankAccount {

	public static void main(String[] args) {
		solution1();

	}

	static void solution1() {
		Scanner sc = new Scanner(System.in);
		long amount = sc.nextLong();
		long count = sc.nextLong();
		int flag = 0;
		for (int i = 0; i < count; i++) {
			long type = sc.nextLong();
			long amount1 = sc.nextLong();
			if (type == 1) {
				amount = amount + amount1;
			} else {
				amount = amount - amount1;
				if (amount < 0) {
					flag = 1;
					amount = amount + amount1;
				}
			}
			if (flag == 0) {
				System.out.println(amount);

			} else {
				System.out.println("Insufficient Funds");
				flag = 0;
			}

		}
	}

}
