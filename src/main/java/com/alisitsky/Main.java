package com.alisitsky;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;


import com.alisitsky.tasks.kyu6.WhichAreIn;
import com.alisitsky.tasks.kyu6.Xbonacci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import static com.alisitsky.tasks.kyu6.Xbonacci.*;
import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        xbonacci(new double []{0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},20);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {

        return Collections.frequency(list, element);
    }
}