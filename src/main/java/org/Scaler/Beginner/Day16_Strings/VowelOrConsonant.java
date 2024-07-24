package org.Scaler.Beginner.Day16_Strings;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		VowelOrConsonant LTH = new VowelOrConsonant();
		Scanner sc = new Scanner(System.in);
		char A = sc.next().charAt(0);
		System.out.println(LTH.isvowel(A));

	}
	public static int isvowel(char c){
		int n = 0;
		if (c>='a'||c>='e'||c>='i'||c>='o'||c>='u') {
			n=1;
		}
		return n;
	    
	}
}
