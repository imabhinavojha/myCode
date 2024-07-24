package org.Scaler.Beginner.Day20;

import java.util.ArrayList;
import java.util.Scanner;

public class bankAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfInput = sc.nextInt();
		ArrayList<Integer> arrli = new ArrayList<Integer>(numberOfInput);
		for (int i = 0; i < numberOfInput; i++) {
			int type = sc.nextInt();
			int amount = sc.nextInt();
			arrli.add(type);
			arrli.add(amount);
		}
		solution2(arrli);

	}

	static int solution2(ArrayList<Integer> A) {
		long amount = 1000, amount1 = 0;
		int flag = 0, type = 0, count = 0;

		for (int j = 0; j < A.size(); j += 2) {
			type = A.get(j);
			amount1 = A.get(++count);
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
				count++;
			} else {
				count++;
				System.out.println("Insufficient Funds");
				flag = 0;
			}

		}
		return flag;
	}

}
