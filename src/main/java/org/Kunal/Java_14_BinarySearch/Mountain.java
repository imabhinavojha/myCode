package org.Kunal.Java_14_BinarySearch;

public class Mountain {

	public static void main(String[] args) {
		Mountain m = new Mountain();
		int[] arr = {0,1,0};
		System.out.println(m.peakIndexInMountainArray(arr));
	}

	public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        System.out.println(end);
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; // or return end as both are =
    }	
	
}
