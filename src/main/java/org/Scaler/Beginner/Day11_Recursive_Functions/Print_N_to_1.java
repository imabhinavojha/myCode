package org.Scaler.Beginner.Day11_Recursive_Functions;

/*Q3. Print N to 1
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description
You are given an integer N, print N to 1 using using recursion.



Problem Constraints
1 <= N <= 105



Input Format
First line contains an integer N.



Output Format
Print N space-separated integers N to 1.
Note: There should be exactly one space after each integer.



Example Input
Input 1:

10
Input 2:

5


Example Output
Output 1:

10 9 8 7 6 5 4 3 2 1 
Output 2:

5 4 3 2 1 
 */
import java.util.Scanner;

public class Print_N_to_1 {

	static int n = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		fun1(N);

	}

	// Prints n, increments n and calls fun1()
	static void fun1(int N) {
		if (N >= n) {
			System.out.printf("%d ", N);
			N--;
			fun2(N);
		} else {
			return;
		}
	}

	// Prints n, increments n and calls fun2()
	static void fun2(int N) {
		if (N >= n) {
			System.out.printf("%d ", N);
			N--;
			fun1(N);
		} else {
			return;
		}
	}

}
