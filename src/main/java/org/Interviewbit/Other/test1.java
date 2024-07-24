package org.Interviewbit.Other;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        String s = "one+two-one-one+two+one";
        calculateResult(s);
    }

    private static int calculateResult(String s) {
        String[] arr = splitString(s);
        int ans = Integer.parseInt(arr[0]);
        System.out.println(" sdn sdfmv "+ans);

        for (int i = 2; i < arr.length; i = i + 2) {
            if (arr[i - 1] == "-") {
                ans = ans - Integer.parseInt(arr[i]);
            }else{
                ans = ans + Integer.parseInt(arr[i]);
            }
        }
        System.out.println("dfjdbgfsgkjvn "+ans);

        return 0;

    }

    private static String[] splitString(String s) {
        String[] arr = s.split("(?=[\\+\\-])|(?<=[\\+\\-])");
        return Arrays.stream(arr)
                .filter(str -> !str.isEmpty())
                .toArray(String[]::new);
    }
}
