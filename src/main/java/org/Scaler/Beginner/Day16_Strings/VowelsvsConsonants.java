package org.Scaler.Beginner.Day16_Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class VowelsvsConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < num; i++) {
			al.add(sc.next());
		}
		for (String string : al) {
			int vCount = 0, cCount = 0;
			string = string.toLowerCase();
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'
						|| string.charAt(i) == 'o' || string.charAt(i) == 'u') {
					vCount++;
				} else if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
					cCount++;
				}
			}
			System.out.println(vCount + " " + cCount);
		}

	}

}
