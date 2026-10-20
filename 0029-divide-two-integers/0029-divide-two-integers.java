
class Solution {
    public int divide(int dividend, int divisor) {

        // Handle overflow: -2147483648 / -1 exceeds int range
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Convert to positive long to avoid overflow with MIN_VALUE
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        // Subtract the largest possible multiples of divisor
        while (a >= b) {
            long temp = b;       // Current multiple of divisor
            int multiple = 1;    // Number of times divisor is multiplied

            // Double the divisor until the next double is too large
            while (a >= (temp << 1)) {
                temp <<= 1;      // Double temp using bit shifting
                multiple <<= 1;  // Double the corresponding quotient
            }

            a -= temp;           // Subtract the largest multiple
            result += multiple;  // Add its quotient to the result
        }

        // If signs differ, the answer must be negative
        if ((dividend < 0) != (divisor < 0)) {
            return -result;
        }

        return result;
    }
}
