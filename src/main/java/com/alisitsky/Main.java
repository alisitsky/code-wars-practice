package com.alisitsky;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;


import com.alisitsky.tasks.kyu5.PeteBaker;

import java.util.Map;


public class Main {

    public static void main(String[] args) {

        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        System.out.println(PeteBaker.cakes(recipe, available));

        recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1,
                "cinnamon", 300);
        available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        System.out.println(PeteBaker.cakes(recipe, available));

    }

}