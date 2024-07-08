package com.alisitsky.tasks.kyu6;

import java.util.ArrayList;
import java.util.Collections;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        ArrayList<String> resultAL = new ArrayList<>();

        for (String s1 : array1)
            for (String s2 : array2)
                if (s2.contains(s1)){
                    resultAL.add(s1);
                    break;
                }

        Collections.sort(resultAL);
        return resultAL.toArray(new String[resultAL.size()]);
    }
}
