class Solution {

    public int bitsCounts(int m) {
        int count = 0;

        while (m > 0) {
            m = m & (m - 1);
            count++;
        }

        return count;
    }

    public int[] countBits(int n) {

        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i] = bitsCounts(i);
        }

        return arr;
    }
}