package org.Scaler.Classes.Other;

import java.lang.*;
import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3945114;
		System.out.println(Integer.toBinaryString(n));

		System.out.println(n >> 1);
		int d = n >> 2;
		System.out.println(Integer.toBinaryString(d));
		
		if ((n & 1) == 0 ) {
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}
		
		int a=7, b=5;
        int carry = a & b;
        System.out.println("carry"+ carry);

        
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));

		a =a^b;
		System.out.println(Integer.toBinaryString(a));

		b =a^b;
		System.out.println(Integer.toBinaryString(b));

		a = a^b;
		System.out.println(Integer.toBinaryString(a));

		System.out.println(a+ " "+ b );

	}
}