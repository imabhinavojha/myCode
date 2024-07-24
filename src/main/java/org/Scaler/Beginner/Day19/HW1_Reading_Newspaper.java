package org.Scaler.Beginner.Day19;

import java.util.ArrayList;
import java.util.Scanner;


public class HW1_Reading_Newspaper {
	
	public static void main(String[] args) {
		HW1_Reading_Newspaper rnp = new HW1_Reading_Newspaper();
		Scanner sc1 = new Scanner(System.in);
		int numberOfLine = sc1.nextInt();

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numberOfDays = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
			numberOfDays.add(sc.nextInt());
		}

		System.out.println(rnp.solve(numberOfLine, numberOfDays));

	}

	public int solve(int A, ArrayList<Integer> B) {
		int count = 0;
		for (Integer integer : B) {
			if (integer > 0) {
				A = A - integer;
				count++;
			}
			if (A <= 0) {

				break;
			}
			if (count == 7) {
				count = 1;

			}
		}
		return count;
	}

}
