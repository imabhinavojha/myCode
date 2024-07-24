package org.Scaler.Beginner.Day16_Strings;

import java.util.Scanner;

public class FirstOccurrenceOfWord {

	public static void main(String[] args) {
		FirstOccurrenceOfWord FOW = new FirstOccurrenceOfWord();
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println(FOW.solve(A, B));

	}

	public int solve(String A, String B) {
		int indexOfSubStr = A.indexOf(B);

		if (indexOfSubStr >= 0) {
			indexOfSubStr++;

		}

		return indexOfSubStr;
	}

}
