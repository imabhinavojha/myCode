package org.Scaler.Beginner.Day15_2D_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		RotateMatrix rm = new RotateMatrix();
		Scanner sc = new Scanner(System.in);

		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < 4; i++) {
			al.add(new ArrayList<Integer>());
			al.get(i).add(sc.nextInt());
		}
		rm.solve(al);
	}

	public void solve(ArrayList<ArrayList<Integer>> A) {
		int N = A.size() - 1;
		for (int i = 0; i < A.size() / 2; i++) {
			for (int j = i; j < N - i; j++) {
				int temp1 = A.get(N - j).get(i);
				int temp2 = A.get(N - i).get(N - j);
				int temp3 = A.get(j).get(N - i);
				int temp4 = A.get(i).get(j);

				A.get(i).set(j, temp1);
				A.get(N - j).set(i, temp2);
				A.get(N - i).set(N - j, temp3);
				A.get(j).set(N - i, temp4);
			}
		}
	}

}
