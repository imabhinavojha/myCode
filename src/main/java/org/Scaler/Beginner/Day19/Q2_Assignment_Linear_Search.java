package org.Scaler.Beginner.Day19;

import java.util.ArrayList;
import java.util.Scanner;


public class Q2_Assignment_Linear_Search {

	public static void main(String[] args) {
		Q2_Assignment_Linear_Search ls = new Q2_Assignment_Linear_Search();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		a.add(sc.nextInt());
		a.add(sc.nextInt());
		a.add(sc.nextInt());
		a.add(sc.nextInt());
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		ls.linearSearch(a, b);

	}

	public int linearSearch(ArrayList<Integer> A, int B) {
		int count = 0;

		for (int i = 0; i < A.size(); i++) {
			Integer temp = A.get(i);

			if (temp.equals(B)) // or if (temp.intValue() == 99)
			{
				count=1;
			}
		}
		return count;
	}
}
