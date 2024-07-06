package com.alisitsky.tasks.kyu6;

import java.util.HashMap;
import java.util.Map;

public class PangramChecker {
//  A pangram is a sentence that contains every single letter of the alphabet at least once.
//  For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
//  because it uses the letters A-Z at least once (case is irrelevant).
//
//  Given a string, detect whether or not it is a pangram.
//  Return True if it is, False if not. Ignore numbers and punctuation.

    public static boolean check(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> lettersAmmountMap = new HashMap<>();

        for (int i = 0; i < alphabet.length(); i++)
            lettersAmmountMap.put(alphabet.charAt(i), 0);

        for (int i = 0; i < sentence.length(); i++) {
            char letter = Character.toLowerCase(sentence.charAt(i));
            if (lettersAmmountMap.containsKey(letter))
                lettersAmmountMap.put(letter, lettersAmmountMap.get(letter) + 1);
        }
        return !lettersAmmountMap.containsValue(0);
    }

    public static boolean check2(String sentence) {
        return sentence.chars()
                .map(Character::toLowerCase)
                .filter(Character::isAlphabetic)
                .distinct()
                .count() == 26;
    }
}