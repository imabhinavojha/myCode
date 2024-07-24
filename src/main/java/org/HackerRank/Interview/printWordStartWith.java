package org.HackerRank.Interview;
public class printWordStartWith {
    public static void main(String[] args) {
        String input = "Abhinav Ojha is good";
        String[] words = input.split(" ");

        for (String word : words) {
            if (word.startsWith("O") || word.startsWith("o")) {
                System.out.println(word);
            }
        }
    }

}
