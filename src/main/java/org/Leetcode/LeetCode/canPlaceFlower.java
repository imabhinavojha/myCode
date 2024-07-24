package org.Leetcode.LeetCode;

public class canPlaceFlower {
    public static void main(String[] args) {
        canPlaceFlower obj = new canPlaceFlower();
        int arr [] = {1,0,0,0,1};
        int n = 2;
        Boolean te = obj.canPlaceFlowers(arr, n);
        System.out.println(te);

        
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (flowerbed[i - 1] == 0) && (flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            if (count >= n) {
                return true;
            }
            i++;
        }
        
        
        return false;

    }
    
}
