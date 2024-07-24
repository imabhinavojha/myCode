package org.Kunal.Java_11_Basic;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		int num2 =0;
		int num3 =1;
		int count =0;
		while(count<num1) {
			System.out.print("  "+num2);
			int num4 = num2+num3;
			num2 = num3;
			num3= num4;
			count = count+1;
		}

		}

}
