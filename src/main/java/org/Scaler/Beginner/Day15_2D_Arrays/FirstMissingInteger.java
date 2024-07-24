package org.Scaler.Beginner.Day15_2D_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstMissingInteger {

	public static void main(String[] args) {
		FirstMissingInteger fmi = new FirstMissingInteger();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			al.add(sc.nextInt());

		}
		System.out.println(fmi.firstMissingPositive(al));

	}

	public int firstMissingPositive(ArrayList<Integer> A) {
		   
	        int len = A.size();
	        boolean[] bits = new boolean[len + 1];
	        
	        for (int n : A) {
	            if (n > 0 && n <= len) {
	                bits[n] = true;    
	            }
	        }
	        
	        if (!bits[1]) {
	            return 1;
	        }
	        
	        for (int i = 2; i <= len; ++i) {
	            if (!bits[i]) {
	                return i;
	            }
	        }
	        
	        return len + 1;
	}

}
