package org.HackerRank.Interview;
import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    public static void main(String[] args) {
        String str1 = "AAB".replaceAll("\\s", "").toLowerCase();
        String str2 = "XYZ".replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("not a Isomorphic");
        }

        Map<Character, Character> mapping = new HashMap<>();
        Map<Character, Boolean> usedCharacters = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char charS = str1.charAt(i);
            char charT = str2.charAt(i);

            if (mapping.containsKey(charS)) {
                if (mapping.get(charS) != charT) {
                    System.out.println("False");
                }
            } else {
                if (usedCharacters.containsKey(charT)) {
                    System.out.println("False");
                }
                mapping.put(charS, charT);
                usedCharacters.put(charT, true);
            }

        }
        
        System.out.println("True");

    }
}
