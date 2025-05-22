package shiftleft;

public class Solution {
    public static int shiftLeft(String a, String b) {
        if (a.equals(b)) {
            return 0;
        }

        int count = 0;

        while (a.length() != b.length()) {
            if (a.length() > b.length()) {
                a = a.substring(1);
                count++;
            } else {
                b = b.substring(1);
                count++;
            }
        }

        while (!a.equals(b)) {
            a = a.substring(1);
            b = b.substring(1);
            count+=2;
        }

        return count;
    }
}
