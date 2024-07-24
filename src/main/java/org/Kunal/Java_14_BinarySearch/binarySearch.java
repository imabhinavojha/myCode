package org.Kunal.Java_14_BinarySearch;

public class binarySearch {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr1 = { 5, 4, 3, 2, 1 };
		int target = 2;
		// System.out.println(searchBinary(arr, target));
		// System.out.println(searchBinary1(arr1, target));
		System.out.println(checkArray(arr1));

	}

	public static String checkArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;

		if (arr[start] > arr[end]) {
			return "D";

		}

		return "A";
	}

	public static int searchBinary1(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				start = mid + 1;

			} else if (target > arr[mid]) {
				end = mid - 1;

			} else {
				return mid;
			}

		}
		return -1;

	}

	public static int searchBinary(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;

			} else if (target > arr[mid]) {
				start = mid + 1;

			} else {
				return mid;
			}

		}
		return -1;

	}

}
