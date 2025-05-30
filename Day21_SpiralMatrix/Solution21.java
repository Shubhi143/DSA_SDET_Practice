package Day21_SpiralMatrix;

public class Solution21 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        java.util.List<Integer> result = spiralOrder(matrix);
        System.out.println("Spiral order: " + result);
        }
    public static java.util.List<Integer> spiralOrder(int[][] matrix) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result; // Return empty list if the matrix is empty
        }

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // Traverse from bottom to top
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result; // Return the spiral order as a list
    }
}
