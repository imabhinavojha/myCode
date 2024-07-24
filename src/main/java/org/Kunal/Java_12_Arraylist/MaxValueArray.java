package org.Kunal.Java_12_Arraylist;

import java.util.Iterator;

public class MaxValueArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 24, 23, 7 };
		System.out.println(max(arr));
	}

	static int max(int[] arr) {
		int maxVal = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			} else {

			}
		}
		return maxVal;

	}

}
