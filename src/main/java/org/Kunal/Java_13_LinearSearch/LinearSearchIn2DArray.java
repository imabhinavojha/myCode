package org.Kunal.Java_13_LinearSearch;

import java.util.Arrays;

public class LinearSearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
		int target = 10;
		int[] ans = search(arr, target);
		System.out.println(Arrays.toString(ans));

		System.out.println(max(arr));
	}

	static int[] search(int arr[][], int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] { row, col };
				}
			}
		}
		return new int[] { -1, -1 };

	}

	static int max1(int arr[][]) {
		int max = arr[0][0];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] > max) {
					max = arr[row][col];
				}
			}
		}
		return max;

	}

	static int max(int arr[][]) {
		int max = Integer.MIN_VALUE;
		for (int[] ele : arr) {
			for (int ele1 : ele) {
				if (ele1 > max) {
					max = ele1;
				}
			}
		}
		return max;

	}

}
