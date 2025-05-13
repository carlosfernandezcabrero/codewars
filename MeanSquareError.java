public class MeanSquareError {
    public static double solution(int[] arr1, int[] arr2) {
        double sum = 0;
        final int maxLength = Math.max(arr1.length, arr2.length);

        for (int i = 0; i < maxLength; i++) {
            sum += Math.pow(Math.abs(arr1[i] - arr2[i]), 2);
        }

        return sum / maxLength;
    }
}
