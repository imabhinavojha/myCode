package org.Leetcode.Array;

public class Defuse_the_Bomb {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 , 6, 7, 8, 9, 10 };
        int k = 2;
        decrypt(arr, k);

    }

    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        System.out.println(n);
        int[] decryptedCode = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                // Calculate the index, handling wrap-around
                int index = (i + j) % n;
                // System.out.println(index);
                sum += code[index];
            }
            System.out.println(" d : "+sum);
            decryptedCode[i] = sum;
        }
        return decryptedCode;
    }

    public static int[] decrypt1(int[] code, int k) {
        int n = code.length;
        int maxi = 0;
        
        int[] decryptedCode = new int[n];

        for (int i = 0; i < n-k+1; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                // Calculate the index, handling wrap-around
                // int index = (i + j) % n;
                // System.out.println(index);
                // System.out.println(" d : "+sum);
                sum = sum+code[i+j];
                // System.out.println(sum);
            }
            System.out.println(" ");
            maxi = Math.max(maxi, sum);
            // decryptedCode[i] = sum;
            System.out.println(" . "+maxi);
        }
        return decryptedCode;
    }
}
