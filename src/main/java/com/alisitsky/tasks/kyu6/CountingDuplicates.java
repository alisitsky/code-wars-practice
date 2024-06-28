package com.alisitsky.tasks.kyu6;

import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {

//      "abcde" -> 0 # no characters repeats more than once
//      "aabbcde" -> 2 # 'a' and 'b'
//      "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//      "indivisibility" -> 1 # 'i' occurs six times
//      "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
//      "aA11" -> 2 # 'a' and '1'
//      "ABBA" -> 2 # 'A' and 'B' each occur twice

        public static int duplicateCount(String text) {
            Set<Character> uniqueChars = new HashSet<>();

            for (int i = 0; i < text.length()-1; i++)
                for (int k = i+1; k < text.length(); k++)
                    if (Character.toLowerCase(text.charAt(i)) ==  Character.toLowerCase(text.charAt(k)))
                        uniqueChars.add(Character.toLowerCase(text.charAt(i)));

            return uniqueChars.size();
        }
}