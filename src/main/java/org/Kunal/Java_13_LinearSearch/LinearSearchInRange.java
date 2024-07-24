package org.Kunal.Java_13_LinearSearch;

public class LinearSearchInRange {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, -6 };
		System.out.println(linearSearch2(arr, -6, 1, 4));
	}

//Retrun True False
	static boolean linearSearch2(int[] arr, int targrt, int start, int end) {
		if (arr.length == 0) {
			return false;

		}
		for (int i = start; i <= end; i++) {
			if (arr[i] == targrt) {
				return true;

			}
		}
		return false;

	}

}