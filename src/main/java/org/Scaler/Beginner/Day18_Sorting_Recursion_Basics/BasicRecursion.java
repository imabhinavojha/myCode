package org.Scaler.Beginner.Day18_Sorting_Recursion_Basics;

public class BasicRecursion {
    public static void main(String[] args) {
        recursion(5);
        recursion(10, 0);
        System.out.println(sum(5));
        palindrome(1235321);
        palindrome(12101201);
        println(1);
    }

    static void println(int i) {
        if (i == 10) {
            System.out.println(10);
            return;
        }
        System.out.println(i);
        println(i + 1);

    }

    static void recursion(int num) {
        if (num <= 0) {
            return;
        }
        // num--;
        System.out.println("call " + num);
        recursion(num - 1);
    }

    static void recursion(int num, int num2) {
        if (num == 1) {
            return;
        }
        System.out.println("recursion " + num + " " + num2);
        num2++;
        num--;
        recursion(num, num2);
    }

    static int sum(int i) {
        // base case
        if (i == 1) {
            return 1;
        }
        // calling recursive function
        return i + sum(i - 1);
    }

    static boolean checkPalindrome(String s, int left, int right) {
        // base condition is the left counter is greater than right then it is
        // palindrome
        if (left >= right) {
            return true;
        }
        // is the two digits are not equal then return false
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        // making recursive call
        return checkPalindrome(s, left + 1, right - 1);
    }

    static void palindrome(int a) {
        // converting number to string
        String s = Integer.toString(a);

        // length of the string
        int n = s.length();

        // calling recursive function
        if (checkPalindrome(s, 0, n - 1)) {
            System.out.println("The number " + a + " is palindrome");
        } else {
            System.out.println("The number " + a + " is not palindrome");
        }
    }
}
