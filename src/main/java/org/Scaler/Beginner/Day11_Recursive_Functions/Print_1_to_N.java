package org.Scaler.Beginner.Day11_Recursive_Functions;

/*Q2. Print 1 to N
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description

You are given an integer N, print 1 to N using using recursion.



Problem Constraints

1 <= N <= 105



Input Format

First line contains an integer N.



Output Format

Print N space-separated integers 1 to N.
Note: There should be exactly one space after each integer.



Example Input

Input 1:

10
Input 2:

5


Example Output

Output 1:

1 2 3 4 5 6 7 8 9 10 
Output 2:

1 2 3 4 5  */

import java.util.Scanner;

public class Print_1_to_N {

	static int n = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		fun1(N);

	}

	// Prints n, increments n and calls fun1()
	static void fun1(int N) {
		if (n <= N) {
			System.out.printf("%d ", n);
			n++;
			fun2(N);
		} else {
			return;
		}
	}

	// Prints n, increments n and calls fun2()
	static void fun2(int N) {
		if (n <= N) {
			System.out.printf("%d ", n);
			n++;
			fun1(N);
		} else {
			return;
		}
	}

}
