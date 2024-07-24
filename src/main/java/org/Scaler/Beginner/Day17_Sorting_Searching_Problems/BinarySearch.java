package org.Scaler.Beginner.Day17_Sorting_Searching_Problems;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(sortedArrayIncreasingOrder());
        System.out.println(sortedArrayDecreasingOrder());
        unSortedArray();

    }

    static int sortedArrayIncreasingOrder() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int num = 7;

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == num) {
                return mid; // Element found, return the index
            } else if (array[mid] < num) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return -1;

    }

    static int sortedArrayDecreasingOrder() {
        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int num = 7;
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == num) {
                return mid; // Element found, return the index
            } else if (array[mid] < num) {
                end = mid - 1; // Search in the left half
            } else {
                start = mid + 1; // Search in the right half
            }
        }

        return -1; // Element not found
    }

    static void unSortedArray() {
        int[] array = { 1, 9, 2, 8, 3, 7, 4, 6, 5 };
        int num = 7;
        //If the array is unsorted, you can't use binary search directly 
        //because binary search requires the array to be sorted. However, 
        //you can use linear search to find the key in an unsorted array.
        for (int i = 0; i < array.length; i++) {
            if (array[i]==num) {
                System.out.print(array[i] + " ");
            }
        }

    }

}
