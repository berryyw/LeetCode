package main;

/**
 * Created by ysun on 4/29/16.
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length ==0) {
            return false;
        }
        if (matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length;
        int column = matrix[0].length;
        int start = 0;
        int end = row * column - 1;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            int num = matrix[mid/column][mid % column];
            if (num == target) {
                return true;
            } else if (num < target ) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (matrix[start / column][start % column] == target) {
            return true;
        } else if (matrix[end / column][end % column] == target) {
            return true;
        }
        return false;

    }
}
