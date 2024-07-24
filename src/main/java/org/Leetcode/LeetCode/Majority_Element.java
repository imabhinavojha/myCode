package org.Leetcode.LeetCode;

public class Majority_Element {
    public static void main(String[] args) {
        int[] array = new int[] { 2,2,1,1,1,2,2,1,1 };
        Majority_Element obj = new Majority_Element();
        obj.majorityElement(array);
    }

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count=1;
            }else if(candidate==num){
                count++;

            }else{
                count--;
            }

        }
        System.out.println(candidate);
        return candidate;

    }
}
