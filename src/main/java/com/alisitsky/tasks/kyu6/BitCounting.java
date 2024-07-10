package com.alisitsky.tasks.kyu6;

public class BitCounting {

    public static int countBits(int n) {
        return (int) Integer.toBinaryString(n)
                .chars()
                .filter(ch -> ch == '1')
                .count();
    }
}