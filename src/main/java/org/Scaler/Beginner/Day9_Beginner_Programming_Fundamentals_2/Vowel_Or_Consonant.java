package org.Scaler.Beginner.Day9_Beginner_Programming_Fundamentals_2;

import java.util.Scanner;

public class Vowel_Or_Consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		Vowel_Or_Consonant pi = new Vowel_Or_Consonant();
		pi.vowelOrConsonant(input);

	}

	public void vowelOrConsonant(char input) {
		if (input=='a'||input=='e'||input=='i'||input=='o'||input=='u') {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		

	}

}
