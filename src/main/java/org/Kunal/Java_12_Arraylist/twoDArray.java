package org.Kunal.Java_12_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class twoDArray {
	public static void main(String[] args) {
		// int[]arr1 = { 6, 7, 8, 9 };
		// System.out.println(Arrays.toString(arr1));

		int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
		// System.out.println(Arrays.toString(arr[2]));

		Scanner sc = new Scanner(System.in);
//		int[][] arr = new int[3][2];
		System.out.println(arr.length);

//		for (int row = 0; row < arr.length; row++) {
//			for (int col = 0; col < arr[row].length; col++) {
//				arr[row][col] = sc.nextInt();
//			}
//
//		}

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println(" ");

		}

		twoDArray tda = new twoDArray();
		tda.name1();
	}

	public void name() {
		ArrayList<Integer> singleDi = new ArrayList<Integer>();
		int j = 9;
		for (int i = 0; i < j; i++) {
			singleDi.add(i);
		}
		System.out.println(singleDi);

	}

	public void name1() {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> multiDi = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < 3; i++) {
			multiDi.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
//				System.out.print(k + " ");
				multiDi.get(i).add(sc.nextInt());
			}
		}
		System.out.println(multiDi);
	}

}
