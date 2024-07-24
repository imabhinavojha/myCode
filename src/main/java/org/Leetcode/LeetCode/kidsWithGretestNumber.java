package org.Leetcode.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kidsWithGretestNumber {
    public static void main(String[] args) {
        kidsWithGretestNumber obj = new kidsWithGretestNumber();
        int[] ret = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        obj.kidsWithCandies(ret, extraCandies);

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().orElse(0);
        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;

    }
}