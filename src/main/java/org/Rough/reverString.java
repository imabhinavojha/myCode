package org.example;

public class reverString {

    public static void main(String[] args) {
        String str = "Hello world.";
        String[] str2 = str.split(" ");
        int len = str2.length;
        for (int i = 0; i < len; i++) {

            for (int j = str2[i].length() - 1; j >= 0; j--) {
                System.out.print(str2[i].charAt(j));
            }
            System.out.print(" ");

        }
    }

}
