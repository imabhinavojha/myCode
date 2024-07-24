package org.Scaler.Beginner.Day11_Recursive_Functions;

/*Q1. Find Factorial!
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints is now penalty free
Use Hint
Problem Description
Write a program to find the factorial of the given number A using recursion.

Note: The factorial of a number N is defined as the product of the numbers from 1 to N.


Problem Constraints
0 <= A <= 12



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the factorial of the number A.



Example Input
Input 1:

 A = 4
Input 2:

 A = 1


Example Output
Output 1:

 24
Output 2:

 1


Example Explanation
Explanation 1:

 Factorial of 4 = 4 * 3 * 2 * 1 = 24
Explanation 2:

 Factorial of 1 = 1 */

public class FindFactorial {

	public static void main(String[] args) {
		FindFactorial obj = new FindFactorial();
		obj.solve(4);

	}

	public int solve(int A) {
			int fact = 1;

			for (int i = 1; i <= A; i++) {
				fact = fact * i;
			}
			return fact;
	}

}
