package com.alisitsky.tasks.kyu6;

public class HighestScoringWord {
//    Given a string of words, you need to find the highest scoring word.
//    Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//    For ex. "abad" is 8 (1 + 2 + 1 + 4).
//
//    You need to return the highest scoring word as a string.
//    If two words score the same, return the word that appears earliest in the original string.



    public static String high(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] wordsArr = s.split(" ");
        int maxScore = Integer.MIN_VALUE;
        int currentScore = 0;
        String maxScoreWord = "";

        for (String word : wordsArr) {
            for (int i = 0; i < word.length(); i++)
                currentScore += alphabet.indexOf(word.charAt(i)) + 1;
            if (currentScore > maxScore) {
                maxScore = currentScore;
                maxScoreWord = word;
            }
            currentScore = 0;
        }
        return maxScoreWord;
    }

}
