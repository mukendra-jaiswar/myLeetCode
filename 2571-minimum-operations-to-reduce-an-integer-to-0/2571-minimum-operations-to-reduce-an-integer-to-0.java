class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();
     //guys i dont understand this code right now i am just submitting it
    public int minOperations(int n) {
        if ((n & (n - 1)) == 0) { // power of 2
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int lower = Integer.highestOneBit(n);
        int upper = lower << 1;

        int ans = 1 + Math.min(
                minOperations(n - lower),
                minOperations(upper - n)
        );

        memo.put(n, ans);
        return ans;
    }
}