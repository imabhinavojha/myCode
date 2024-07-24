package org.Scaler.Intermediate.Day27;

import java.util.Scanner;

public class SummationGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println(findSum(n));
		
	}
	
    static int findSum(int n)
    {
        return n * (n + 1) / 2;
    }

}
