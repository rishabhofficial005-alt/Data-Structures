import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int start_row = 0;
        int end_row = rows - 1;
        int start_column = 0;
        int end_column = cols - 1;

        List<Integer> ans = new ArrayList<>();

        while (start_row <= end_row && start_column <= end_column) {

            // Top
            for (int i = start_column; i <= end_column; i++) {
                ans.add(matrix[start_row][i]);
            }

            // Right
            for (int j = start_row + 1; j <= end_row; j++) {
                ans.add(matrix[j][end_column]);
            }

            // Bottom
            if (start_row < end_row) {
                for (int i = end_column - 1; i >= start_column; i--) {
                    ans.add(matrix[end_row][i]);
                }
            }

            // Left
            if (start_column < end_column) {
                for (int j = end_row - 1; j > start_row; j--) {
                    ans.add(matrix[j][start_column]);
                }
            }

            // Move towards the inner layer
            start_row++;
            end_row--;
            start_column++;
            end_column--;
        }

        return ans;
    }
}