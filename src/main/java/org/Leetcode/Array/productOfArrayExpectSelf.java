package org.Leetcode.Array;

public class productOfArrayExpectSelf {
    public static void main(String[] args) {
        int[] array = { -1, 1, 0, -3, 3 };
        productOfArrayExpectSelf obj = new productOfArrayExpectSelf();
        obj.productExceptSelf(array);
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct = leftProduct*nums[i];
        }
        

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i]*rightProduct;
            rightProduct = rightProduct*nums[i];
        }

        return result;
    }

}
