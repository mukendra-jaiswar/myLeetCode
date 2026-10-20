
import java.util.*;

class Solution {
    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();

        // Base index before the start of a valid substring
        stack.push(-1);

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                // Store the index of the opening bracket
                stack.push(i);
            } else {
                // Remove the matching opening bracket or base index
                stack.pop();

                if (stack.isEmpty()) {
                    // No matching opening bracket: reset the base index
                    stack.push(i);
                } else {
                    // Calculate the length of the valid substring
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }
}
