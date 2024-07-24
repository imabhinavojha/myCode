package org.Kunal.Java_11_Basic;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			
			int  originalNumber, remainder, result = 0;

	        originalNumber = num1;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == num1)
	            System.out.println(num1 + " is an Armstrong number.");
	        //else
	            //System.out.println(num1 + " is not an Armstrong number.");
	    
		}
		
		}

}
