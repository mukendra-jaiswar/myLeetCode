
class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        generate("", 0, 0, n, result);

        return result;
    }

    public void generate(String s, int open, int close, int n, List<String> result) {

        // If we have used all parentheses
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }

        // Add opening bracket
        if (open < n) {
            generate(s + "(", open + 1, close, n, result);
        }

        // Add closing bracket
        if (close < open) {
            generate(s + ")", open, close + 1, n, result);
        }
    }
}
