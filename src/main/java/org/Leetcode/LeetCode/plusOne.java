package org.Leetcode.LeetCode;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = { 9 };
        plusOne obj = new plusOne();
        obj.plusOne1(digits);

    }

    public int[] plusOne(int[] digits) {
        int newDigits[] = new int[digits.length];
        int lenght = digits.length - 1;

        for (int i = 0; i < digits.length; i++) {
            newDigits[i] = digits[i];
            if (lenght == i) {
                newDigits[i] = digits[i] + 1;
                if (newDigits[i]==10) {
                    newDigits[i] = 0;
                }
            }
        }
        for (int i : newDigits) {
            System.out.println(i);
        }

        return newDigits;

    }

    public int[] plusOne1(int[] digits) {
        int n = digits.length;
       
       // Start from the least significant digit
       for (int i = n - 1; i >= 0; i--) {
           // Increment the current digit by one
           digits[i]++;
           // If the digit becomes 10, set it to 0 and continue to the next digit
           if (digits[i] == 10) {
               digits[i] = 0;
           } 
           // If the digit is less than 10, no carry-over, so return the updated digits
           else {
               return digits;
           }
       }
       
       // If we reach here, it means all digits were 9, so we add a new leading 1
       int[] newDigits = new int[n + 1];
       newDigits[0] = 1;
       for (int i : newDigits) {
        System.out.println(i);
       }
       return newDigits;
}

}
