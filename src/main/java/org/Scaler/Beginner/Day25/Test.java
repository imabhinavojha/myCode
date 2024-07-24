package org.Scaler.Beginner.Day25;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6};
		int len = arr.length;
		System.out.println(len);
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print("  "+arr[i]);
		}
	}
}
