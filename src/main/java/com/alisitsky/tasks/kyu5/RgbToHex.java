package com.alisitsky.tasks.kyu5;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        return convertToHex(correctRange(r)) +
                convertToHex(correctRange(g)) +
                convertToHex(correctRange(b));
    }

    private static int correctRange(int i){
        i = i < 0 ? 0 : i;
        i = i > 255 ? 255 : i;
        return i;
    }

    private static String convertToHex(int i) {
        String hex = Integer.toHexString(i).toUpperCase();
        return hex.length() == 1 ? "0" + hex : hex;
    }
/**************/
    public static String rgb2(int r, int g, int b) {
    return String.format("%02X%02X%02X", verify(r), verify(g), verify(b));
}

    private static int verify(int i) {
        return i > 0 ? Math.min(255, i) : 0;
    }
}

