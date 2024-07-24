package org.Leetcode.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class uniqueOccurrences {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1, 1, 3 };
        boolean value = findOccurrences(arr);
        System.out.println(value);
    }

    public static boolean findOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int num : arr) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        Set<Integer> uniqueCounts = new HashSet<>();
        for (int count : occurrences.values()) {
            if (!uniqueCounts.add(count)) {
                // If a count is not unique, return false
                return false;
            }
        }

        return true;
    }

}
