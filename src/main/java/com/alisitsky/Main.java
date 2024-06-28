package com.alisitsky;

import static com.alisitsky.tasks.kyu6.HighestScoringWord.high;

public class Main {
    public static void main(String[] args) {

//        high("aa bb ab d");
//        System.out.println(high("aa bb ab d"));
//        System.out.println(high("to"));
        System.out.println(high("man i need a taxi up to ubud"));    //  taxi
        System.out.println(high("what time are we climbing up to the volcano"));  //  volcano
        System.out.println(high("take me to semynak"));   //  semynak
        System.out.println(high("aa b"));  //  aa
        System.out.println(high("b aa"));   //  b
        System.out.println(high("bb d"));  //  bb
        System.out.println(high("d bb"));   //  d
        System.out.println(high("aaa b"));    //  aaa
    }
}