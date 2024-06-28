package com.alisitsky.tasks.kyu6;

public class CreatePhoneNumber {


//            System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})); // => returns "(123) 456-7890"

    public static String createPhoneNumber(int[] ints) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                ints[0],
                ints[1],
                ints[2],
                ints[3],
                ints[4],
                ints[5],
                ints[6],
                ints[7],
                ints[8],
                ints[9]);
    }

}
