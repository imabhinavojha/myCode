package org.Scaler.Beginner.Day15_2D_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class removeThat {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int input = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < input; i++) {
			al.add(sc.nextInt());
		}
		int removeIndex = sc.nextInt();
		al.remove(--removeIndex);
		for (Integer integer : al) {
			System.out.print(integer+" ");
		}

	}

}
