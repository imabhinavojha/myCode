package org.Leetcode.Array;

public class bestTimeTobuyStock {
    public static void main(String[] args) {
        int[] num = { 7, 1, 5, 3, 6, 4 };
        bestTimeTobuyStock obj = new bestTimeTobuyStock();
        int maxProfit = obj.bestTimeTobuyStock1(num);
        System.out.println(maxProfit);

    }

    public int bestTimeTobuyStock1(int[] num) {
        int minPrice = Integer.MAX_VALUE;
        System.out.println("Min Price "+minPrice);
        int maxPrice = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < minPrice) {
                minPrice = num[i];

            } else if (num[i] - minPrice > maxPrice) {
                maxPrice = num[i] - minPrice;
            }
        }
        return maxPrice;
    }
}
