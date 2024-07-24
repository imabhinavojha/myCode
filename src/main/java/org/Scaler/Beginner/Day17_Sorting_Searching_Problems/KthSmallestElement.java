/**
 * The KthSmallestElement class contains a main method that calls the kthsmallest method to sort an
 * array and return the Bth smallest element.
 */
package org.Scaler.Beginner.Day17_Sorting_Searching_Problems;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] array = { 74, 90, 85, 58, 69, 77, 90, 85, 18, 36 };
        System.out.println(kthsmallest(array, 1));

    }

    static int kthsmallest(final int[] A, int B) {
        int len = A.length;
        int value = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        
        value = A[B-1];
        return value;
    }
}
