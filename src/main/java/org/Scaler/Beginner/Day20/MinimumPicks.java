package org.Scaler.Beginner.Day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumPicks {
	public static void main(String[] args) {

		int[] myArray = { 0, 2, -98 };
		List<Integer> intList = new ArrayList<Integer>(myArray.length);

	}

	public int solve(ArrayList<Integer> intList) {
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();

		for (int i = 0; i < intList.size(); i++) {
			if (intList.get(i) % 2 == 0) {
				evenList.add(intList.get(i));
			} else {
				oddList.add(intList.get(i));
			}
		}
		int Even = Collections.max(evenList);
		int Odd = Collections.max(oddList);
		int result = Even - Odd;
		System.out.println(result);
		return result;
	}

}
