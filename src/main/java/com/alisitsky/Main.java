package com.alisitsky;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;


import com.alisitsky.tasks.kyu6.WhichAreIn;
import com.alisitsky.tasks.kyu6.Xbonacci;

import java.util.HashSet;
import java.util.Iterator;

import static com.alisitsky.tasks.kyu6.Xbonacci.*;
import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        String a[] = new String[]{ "live" ,"arp", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        WhichAreIn.inArray(a, b);
    }
}