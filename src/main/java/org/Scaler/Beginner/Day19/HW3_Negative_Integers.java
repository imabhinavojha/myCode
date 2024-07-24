package org.Scaler.Beginner.Day19;

import java.util.ArrayList;
import java.util.Scanner;

public class HW3_Negative_Integers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long size = sc.nextInt();
		ArrayList<Integer> noOfElement = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			noOfElement.add(sc.nextInt());
		}
		ArrayList<Integer> negElement = new ArrayList<>();

		for (Integer integer : noOfElement) {
			if (integer < 0) {
				negElement.add(integer);

			}
		}
		for (Integer integer1 : negElement) {
			System.out.print(integer1+" ");

		}

	}

}
