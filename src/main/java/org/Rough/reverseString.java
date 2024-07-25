package org.example;

public class reverseString {
    public static void main(String[] args) {
        reverseString rs = new reverseString();
        String name = "Abhinav";
        rs.reves(name);

    }

    public void reves(String name) {
        char[] convertString = name.toCharArray();
        int left = 0;
        int right = convertString.length-1;
        for (int i = right; i >= left; i--) {
            System.out.print(convertString[i]);
            
        }

    }

}
