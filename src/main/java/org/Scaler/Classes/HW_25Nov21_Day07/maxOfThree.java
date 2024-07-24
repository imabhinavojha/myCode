package org.Scaler.Classes.HW_25Nov21_Day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class maxOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> x = new ArrayList<Integer>();
		String s[] = sc.nextLine().split(" ");
		for (int i = 0; i < s.length; i++) {
			int a = Integer.parseInt(s[i]);
			x.add(a);
			
		}
		System.out.println(Collections.max(x));
	}

}
