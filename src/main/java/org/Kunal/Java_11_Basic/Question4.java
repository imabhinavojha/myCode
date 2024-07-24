package org.Kunal.Java_11_Basic;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p =sc.nextInt();
		int r = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		String t = sc1.next();
		if (t.contentEquals("+")) {
			System.out.println(p+r);
		} else {
			System.out.println(p-r);
		}

		}

}
