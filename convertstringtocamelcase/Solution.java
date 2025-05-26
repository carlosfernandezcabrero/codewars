package convertstringtocamelcase;

public class Solution {
    static String toCamelCase(String s) {
        boolean previousIsLetter = false;
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (Character.isLetter(character)) {
                if (!previousIsLetter && i > 0) {
                    sBuilder.append(Character.toUpperCase(character));
                } else {
                    sBuilder.append(character);
                }
            }
            previousIsLetter = Character.isLetter(character);
        }
        return sBuilder.toString();
    }
}
