import java.util.Arrays;

public class ExtraTask1 {
    public static int nextBigger(int num) {
        char[] digits = Integer.toString(num).toCharArray();

        int pivot = -1;
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            return -1;
        }

        int nextGreaterIndex = -1;
        for (int i = digits.length - 1; i > pivot; i--) {
            if (digits[i] > digits[pivot]) {
                nextGreaterIndex = i;
                break;
            }
        }

        char temp = digits[pivot];
        digits[pivot] = digits[nextGreaterIndex];
        digits[nextGreaterIndex] = temp;

        Arrays.sort(digits, pivot + 1, digits.length);

        int result = Integer.parseInt(new String(digits));
        return result;
    }

}
