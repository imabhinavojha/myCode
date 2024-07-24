package org.Kunal.Java_11_Basic;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 =sc.next();
		String num2 ="";
		//System.out.println(num1);
		for (int i = num1.length()-1; i >= 0; i--) {
			 num2 = num2+num1.charAt(i);
			
			}
		
		if (num1.toLowerCase().contentEquals(num2.toLowerCase())) {
			System.out.print("Palin");
		} else {
			System.out.print("Not Palin");
		}
		}

}
