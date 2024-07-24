package org.Scaler.Beginner.Day8_Beginner_Programming_Fundamentals_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_of_evens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Sum_of_evens sum = new Sum_of_evens();
        sum.solve(num);
    }

    public int solve(int num) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i%2 == 0) {
                al.add(i);
                sum = sum + i;
            }
        }
        return sum;
    }
}
