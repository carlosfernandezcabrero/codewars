package petethebaker;

import java.util.HashMap;
import java.util.Map;

public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        var availableMutable = new HashMap<>(available);

        // Normalize missing ingredients
        recipe.keySet().forEach(key -> availableMutable.putIfAbsent(key, 0));

        int count = 0;
        while (recipe.keySet().stream().allMatch(key -> availableMutable.get(key) >= recipe.get(key))) {
            recipe.forEach((key, amount) -> availableMutable.compute(key, (k, v) -> v - amount));
            count++;
        }

        return count;
    }
}
