package org.Scaler.Beginner.Day9_Beginner_Programming_Fundamentals_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class percentage_and_Grade {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String lines = br.readLine();
		String[] strs = lines.trim().split("\\s+");
		int scored = 0;
		int percentage;
		float total_marks=500;

		for (int i = 0; i < strs.length; i++) {
			int a = (Integer) Integer.parseInt(strs[i]);
			scored = scored + a;
		}
	    percentage = (int)((scored / total_marks) * 100);
	    System.out.print(percentage+ " ");
	    if (percentage >= 90) {
	    	System.out.print("A");
			
		}if (percentage >= 80 && percentage < 90) {
	    	System.out.print("B");
			
		}if (percentage >= 70 && percentage < 80) {
	    	System.out.print("C");
			
		}if (percentage >= 60 && percentage < 70) {
	    	System.out.print("D");
			
		}if (percentage >= 40 && percentage < 60) {
	    	System.out.print("E");
			
		}if (percentage < 40) {
	    	System.out.print("F");
		}
	}

}
