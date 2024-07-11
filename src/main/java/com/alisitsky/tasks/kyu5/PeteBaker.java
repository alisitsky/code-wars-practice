package com.alisitsky.tasks.kyu5;

    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Map;

public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        if (recipe.size() > available.size())
            return 0;
        else {
            ArrayList<Integer> piesPerIngredient = new ArrayList<>();
            for (Map.Entry recipeEntry : recipe.entrySet()) {
                int availableQuantity = available.get(recipeEntry.getKey()) == null ? 0 : available.get(recipeEntry.getKey());
                int recipeQuantity = (Integer) recipeEntry.getValue();
                piesPerIngredient.add(availableQuantity / recipeQuantity);
            }
            return Collections.min(piesPerIngredient);
        }
    }

    public static int cakes2(Map<String, Integer> requirements, Map<String, Integer> availableResources) {
        int maxSets = Integer.MAX_VALUE;
        for (String key: requirements.keySet()) {
            if (!availableResources.containsKey(key)) return 0;

            maxSets = Integer.min(maxSets, availableResources.get(key) / requirements.get(key));
        }

        return maxSets;
    }
}