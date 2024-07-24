package org.Scaler.Beginner.Day17_Sorting_Searching_Problems;

public class Square_Root_of_Integer {
    public static void main(String[] args) {
        int x = 11;
        
        System.out.println(sqrt(x));
    }

    static int sqrt(int x) {
      
        if (x <= 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid^2 is less than or equal to x
            if (mid <= x / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
