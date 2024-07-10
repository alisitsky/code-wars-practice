package com.alisitsky.tasks.kyu6;

public class DRoot {
    public static int digital_root(int n) {

        String nStr = Integer.toString(n);
        int nLength = nStr.length();
        int result = 0;

        while (nLength > 1) {
            result = 0;
            for (int i = 0; i < nLength; i++)
                result += Character.getNumericValue(nStr.charAt(i));
            nLength = Integer.toString(result).length();
            nStr = Integer.toString(result);
        }
        return result;
    }
}
