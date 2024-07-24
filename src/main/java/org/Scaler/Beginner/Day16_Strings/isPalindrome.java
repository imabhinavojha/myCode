package org.Scaler.Beginner.Day16_Strings;
import java.util.ArrayList;
import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < num; i++) {
			al.add(sc.next());
		}
		for (String string : al) {
			StringBuilder sb = new StringBuilder(string);
			sb.reverse();
			String rev = sb.toString();
			if (string.equals(rev)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}

		}

	}

}
