package org.Scaler.Beginner.Day14_Arrays;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		System.out.println(name(1011));
	}

	static int name(int n) {
		 int num = n;
	        int dec_value = 0;
	 
	        // Initializing base
	        // value to 1, i.e 2^0
	        int base = 1;
	 
	        int temp = num;
	        while (temp > 0) {
	            int last_digit = temp % 10;
	            temp = temp / 10;
	 
	            dec_value += last_digit * base;
	 
	            base = base * 2;
	        }
	        return dec_value;
	}

	static void name1() {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		System.out.println(Integer.parseInt(n, 2));
	}

}
