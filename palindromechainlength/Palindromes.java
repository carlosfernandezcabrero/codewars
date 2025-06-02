package palindromechainlength;

public class Palindromes {
    public static int palindromeChainLength(long n) {
        int steps = 0;
        long r = 0;
        do {
            steps++;
            n += r;
            long c = n;
            r = 0;
            while (c > 0) {
                long y = c / 10;
                long x = c % 10;
                c = y;
                r = (r * 10) + x;
            }
        } while (n != r);

        return steps - 1;
    }
}
