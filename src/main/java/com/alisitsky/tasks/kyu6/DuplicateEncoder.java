package com.alisitsky.tasks.kyu6;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEncoder {

//    The goal of this exercise is to convert a string to a new string where each character in the new string
//    is "(" if that character appears only once in the original string,
//    or ")" if that character appears more than once in the original string.
//    Ignore capitalization when determining if a character is a duplicate.
//        "din"      =>  "((("
//        "recede"   =>  "()()()"
//        "Success"  =>  ")())())"
//        "(( @"     =>  "))(("

    public static String encode(String word) {
        word = word.toLowerCase();
        int repeats = 1;
        Set<Integer> uniqCharIndexes = new HashSet<>();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            for (int k = 0; k < word.length(); k++)
                if (word.charAt(i) == word.charAt(k) && i != k)
                    repeats++;
            if (repeats == 1)
                uniqCharIndexes.add(i);
            repeats = 1;
        }

        for(int i = 0; i < word.length(); i ++)
            if (uniqCharIndexes.contains(i))
                result += "(";
            else
                result += ")";

        return result;
    }

    static String encode2(String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }
}
