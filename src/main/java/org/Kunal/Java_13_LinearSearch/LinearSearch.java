package org.Kunal.Java_13_LinearSearch;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, -6 };
		System.out.println(linearSearch(arr, -6));

	}
	//Retrun True False
	static boolean linearSearch2(int[] arr, int targrt) {
		if (arr.length == 0) {
			return false;

		}
		for (int element : arr) {
			if (element == targrt) {
				return true;

			}
		}
		return false;

	}
	//Retrun Index Value
	static int linearSearch1(int[] arr, int targrt) {
		if (arr.length == 0) {
			return -1;

		}
		for (int element : arr) {
			if (element == targrt) {
				return element;

			}
		}
		return -1;

	}
	//Retrun Index Number
	static int linearSearch(int[] arr, int targrt) {
		if (arr.length == 0) {
			return -1;

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == targrt) {
				return i;

			}
		}
		return -1;

	}

}
