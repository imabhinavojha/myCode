package org.Scaler.Beginner.Day8_Beginner_Programming_Fundamentals_1;

import java.util.Scanner;

/* Problem Description

Given an integer N as input, print the corresponding Full Numeric Pyramid pattern for N.

For example if N = 5 then pattern will be like:

0 0 0 0 1 0 0 0 0 
0 0 0 2 3 2 0 0 0 
0 0 3 4 5 4 3 0 0
0 4 5 6 7 6 5 4 0
5 6 7 8 9 8 7 6 5 

NOTE: There should be exactly one extra space after each number for each row.


Problem Constraints

2 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the Full Pyramid pattern corresponding to the given N.

NOTE:

There is no extra space before the first integer of any row.
There is an extra space after the last integer of any row.
All the integers in any row are space separated.


Example Input

Input 1:

 2
Input 2:

 3


Example Output

Output 1:

0 1 0
2 3 2
Output 2:

0 0 1 0 0
0 2 3 2 0
3 4 5 4 3



Example Explanation

 Print the pattern as described.

 */
public class Full_Numeric_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; //= sc.nextInt();
        num = 3;
        int  k = 0, count = 0, count1 = 0;

        for (int i = 1; i <= num; ++i) {
          for (int space = 1; space <= num - i; ++space) {
            System.out.print(0+"  ");
            ++count;
          }
    
          while (k != 2 * i - 1) {
            if (count <= num - 1) {
              System.out.print((i + k) + " ");
              ++count;
            } else {
              ++count1;
              System.out.print((i + k - 2 * count1) + " ");
            }
    
            ++k;
          }
          count1 = count = k = 0;
    
          System.out.println();
        }
        
    }
    
}
