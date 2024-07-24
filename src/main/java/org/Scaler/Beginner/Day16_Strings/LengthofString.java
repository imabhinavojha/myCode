package org.Scaler.Beginner.Day16_Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class LengthofString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < num; i++) {
			al.add(sc.next());
		}
		for (String string : al) {
			string = string.toLowerCase();
			System.out.println(string.length());
		}
	}

}
