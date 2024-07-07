package com.alisitsky.tasks.kyu6;

import java.util.ArrayList;
import java.util.Arrays;

public class Xbonacci {

//  Well met with Fibonacci bigger brother, AKA Tribonacci.
//
//  As the name may already reveal, it works basically like a Fibonacci, but summing the last 3 (instead of 2) numbers of the sequence to generate the next. And, worse part of it, regrettably I won't get to hear non-native Italian speakers trying to pronounce it :(
//
//  So, if we are to start our Tribonacci sequence with [1, 1, 1] as a starting input (AKA signature), we have this sequence:
//
//  [1, 1 ,1, 3, 5, 9, 17, 31, ...]
//  But what if we started with [0, 0, 1] as a signature? As starting with [0, 1] instead of [1, 1] basically shifts the common Fibonacci sequence by once place, you may be tempted to think that we would get the same sequence shifted by 2 places, but that is not the case and we would get:
//
//  [0, 0, 1, 1, 2, 4, 7, 13, 24, ...]
//  you need to create a fibonacci function that given a signature array/list,
//  returns the first n elements - signature included of the so seeded sequence.
//
//  Signature will always contain 3 numbers;
//  n will always be a non-negative number;
//  if n == 0, then return an empty array and be ready for anything else which is not clearly specified ;)

    public static double[] tribonacci(double[] dArr, int n) {
        double[] result = new double[n];

        ArrayList<Double> resAL = new ArrayList<>();
        for (double d : dArr)
            resAL.add(d);

        if (n == 0)
            return result;

        else if (n == 1) {
            for (int i = 0; i < resAL.size(); i++)
                result[i] = resAL.get(i);
            return result;

        } else if (n == 2) {
            for (int i = 0; i < resAL.size(); i++)
                result[i] = resAL.get(i);
            return result;

        } else if (n == 3) {
            return dArr;
        } else if (n > 3) {
            for (int i = 4; i <= n; i++)
                resAL.add(resAL.get(i - 2) + resAL.get(i - 3) + resAL.get(i - 4));
        }


        for (int i = 0; i < resAL.size(); i++)
            result[i] = resAL.get(i);

        System.out.println(Arrays.toString(result));
        return result;
    }

    public static double[] tribonacci2(double[] dArr, int n) {
        double[] result = new double[n];

        int elementsToTransfer = n >= 4 ? 3 : n;
        for (int i = 1; i <= elementsToTransfer; i++)
            result[i - 1] = dArr[i - 1];

        if (result.length > 3)
            for (int i = 3; i < n; i++)
                result[i] = result[i - 1] + result[i - 2] + result[i - 3];

        return result;
    }

    public static double[] tribonacci3(double[] dArr, int n) {
        double[] tritab=Arrays.copyOf(dArr, n);
        for(int i=3;i<n;i++){
            tritab[i]=tritab[i-1]+tritab[i-2]+tritab[i-3];
        }
        System.out.println(Arrays.toString(tritab));
        return tritab;
    }

}
























