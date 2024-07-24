package org.Kunal.Java_13_LinearSearch;

public class LinearSearchFindMaxArray {

	public static void main(String[] args) {

		int[] arr = { -1, 2, 3, -13, 5, -12 };
		System.out.println(findMax(arr));
	}

	// Retrun True False
	static int findMax(int[] arr) {
		int max	 = arr[0];
		if (arr.length == 0) {
			return 1;

		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}

}