package directionsreduction;

import java.util.Arrays;
import java.util.Stack;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        if (arr == null || arr.length == 0)
            return new String[] {};

        final Stack<String> reduced = new Stack<>();
        final String[] combinations = { "NORTHSOUTH", "SOUTHNORTH", "EASTWEST", "WESTEAST" };

        for (String current : arr)
            if (!reduced.isEmpty()
                    && Arrays.stream(combinations).anyMatch(reduced.lastElement().concat(current)::equals))
                reduced.pop();
            else
                reduced.push(current);

        if (arr.length != reduced.size())
            return dirReduc(reduced.toArray(new String[0]));

        return arr;
    }
}
