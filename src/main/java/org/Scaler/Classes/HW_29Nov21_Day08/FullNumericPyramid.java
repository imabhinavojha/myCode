package org.Scaler.Classes.HW_29Nov21_Day08;

import java.util.ArrayList;
import java.util.Scanner;

public class FullNumericPyramid {

	public static void main(String[] args) {
		FullNumericPyramid.name();
	}

	static void name() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int noOfRows = n;
		int noOfCol = 2 * n - 1;
		ArrayList<int[]> allRows = new ArrayList<int[]>();
		for (int r = 0; r < noOfRows; r++) {
			int[] oneRow = new int[noOfCol];

			int midValue = r * 2 + 1;
			oneRow[n - 1] = midValue;
			for (int c = n - 1; c > n - 1 - r; c--) {
				midValue = midValue - 1;
				if (midValue < 0) {
					midValue = 0;
				}
				oneRow[c - 1] = midValue;
			}
			midValue = r * 2 + 1;
			for (int c = n + 1; c <= n + r; c++) {
				midValue = midValue - 1;
				if (midValue < 0) {
					midValue = 0;
				}
				oneRow[c - 1] = midValue;
			}
			allRows.add(oneRow);
		}
		
		allRows.forEach((t) -> {
			for (int i : t) {
				System.out.print(i+" ");

			}
			System.out.println();
		});

		//Using Advance for Loop
		/*for (int[] is : allRows) {
			for (int i : is) {
				System.out.print(" "+i);
				
			}
			System.out.println();
		}*/
		
		//Normal For Loop
		/*for (int i = 0; i < allRows.size(); i++) {
			for (int j = 0; j < allRows.get(i).length; j++) {
				System.out.print(allRows.get(i)[j]+ " ");
				
			}
			System.out.println();
			
		}*/
	
		
	}

	static void name1() {

		Scanner sc = new Scanner(System.in);
		int n = 3;
		int i, j, num = 1, gap, reverse, count;

		gap = n - 1;
		reverse = (n + n) - 1;

		for (j = 1; j <= n; j++) {
			num = j;

			for (i = 1; i <= gap; i++)
				System.out.print("0 ");

			gap--;
			count = i++;
			// System.out.println(count+"count");

			for (i = 1; i <= j; i++) {
				System.out.print(num + " ");
				num++;

			}

			num--;
			num--;
			for (i = 1; i < j; i++) {
				System.out.print(num + " ");
				num--;
			}

			for (i = reverse; i >= count - 1; i--)
				System.out.print("0 ");

			System.out.println(" ");
		}
	}

}
