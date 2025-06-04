package splitstrings;

import java.util.stream.IntStream;

public class StringSplit {
    public static String[] solution(String s) {
        String[] result = new String[s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1];
        IntStream.range(0, s.length() / 2).forEach(i -> result[i] = s.substring(i * 2, 2 + (i * 2)));
        if (s.length() % 2 != 0) {
            result[result.length - 1] = s.substring(s.length() - 1) + "_";
        }
        return result;
    }
}
