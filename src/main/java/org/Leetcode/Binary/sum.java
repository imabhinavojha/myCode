package org.Leetcode.Binary;

public class sum {
    public static void main(String[] args) {
        sum s = new sum();   
        int a = 3, b = 4;
        s.getSum(a, b);

        int aa = a & b;
        System.out.println(aa);

        int ab = a ^ b;
        System.out.println(ab);

        int ac = a << b;
        System.out.println(ac);

    }
    public int getSum(int a, int b) {
        while (b!=0) {
            int carry = a & b;
            a = a ^ b;
            b  = carry << 1;
        }

        return a;
    }
}
