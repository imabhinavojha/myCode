package org.Scaler.Beginner.Day17_Sorting_Searching_Problems;

public class CountswapsinBubbleSortII {

	public static void main(String[] args) {
		int[] array = { 2, 10, 4, 11 };
		System.out.println(sort2(array));
	}

	static int sort2(int[] A) {
		int len = A.length;
		int count = 0;
		for (int i = 0; i < len - 1; i++) {
			
			for (int j = 0; j < len - i - 1; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
					count++;
				}
			}
		}
		return count;
	}

	static void sort1() {
		int num = 24;
		int time1 = (int) System.nanoTime();
		for (int i = 1; i * i <= num; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		int time2 = (int) System.nanoTime();
		System.out.println("Time 1");
		System.out.println(time2 - time1);

		int time3 = (int) System.nanoTime();
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		int time4 = (int) System.nanoTime();
		System.out.println("Time 2");
		System.out.println(time4 - time3);
	}

}
