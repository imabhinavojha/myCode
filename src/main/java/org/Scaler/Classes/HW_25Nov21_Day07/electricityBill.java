package org.Scaler.Classes.HW_25Nov21_Day07;

import java.util.Scanner;

public class electricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		float sum = 0;
		float a= (float) (0.5*50);
		float b= (float) (a+(0.75*100));
		float c= (float) (b+(1.20*100));
		
		if (input <= 50) {
			sum = (float) (input * 0.5);
		} else if (input <= 150) {
			
			sum = (float) (a+(input-50)* 0.75);
		} else if (input <= 250) {
			
			sum = (float) (b+(input-150)* 1.20);
		} else {
			sum = (float) (c+(input-250)* 1.50);
		}
		sum = (long) (sum*1.2);
		System.out.println(Math.round(sum));
	}

}
