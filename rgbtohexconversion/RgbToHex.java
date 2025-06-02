package rgbtohexconversion;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        final char[] hexadecimalChars = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C',
                'D',
                'E',
                'F' };
        final StringBuilder hex = new StringBuilder();
        final int[] rgbValues = { r, g, b };

        for (int value : rgbValues) {
            if (value < 0) {
                value = 0;
            } else if (value > 255) {
                value = 255;
            }
            int firstDigit = value / 16;
            int secondDigit = value % 16;
            hex.append(hexadecimalChars[firstDigit]);
            hex.append(hexadecimalChars[secondDigit]);
        }

        return hex.toString();
    }
}
