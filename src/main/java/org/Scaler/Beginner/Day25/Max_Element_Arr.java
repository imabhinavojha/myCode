package org.Scaler.Beginner.Day25;

public class Max_Element_Arr {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 9, 6, 9, 5, 6, 9 };
		int maxval = Integer.MIN_VALUE;
		int n = arr.length;
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			if (maxval < arr[i]) {
				maxval = arr[i];
			}
		}
		
		for (int j = 0; j < n; j++) {
			if (arr[j] == maxval) {
				cnt++;
			}
		}
		System.out.print("Ans  ");
		System.out.print(n-cnt);

	}
}
