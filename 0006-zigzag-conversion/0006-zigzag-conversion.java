
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        // Create a StringBuilder for each row
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        int direction = 1; // 1 = down, -1 = up

        // Place each character into its zigzag row
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Change direction at the top or bottom row
            if (currentRow == 0) {
                direction = 1;
            } else if (currentRow == numRows - 1) {
                direction = -1;
            }

            currentRow += direction;
        }

        // Combine all rows to get the final answer
        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
