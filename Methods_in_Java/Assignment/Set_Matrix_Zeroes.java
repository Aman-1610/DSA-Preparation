public class Set_Matrix_Zeroes 
{
    public static void main(String[] args) 
    {
        Solution solution = new Solution();

        int[][] matrix = 
        {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };

        solution.setZeroes(matrix);

        // Print the matrix after modification
        for (int[] row : matrix) 
        {
            for (int val : row) 
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int row = matrix.length; // Number of rows in the matrix
        int col = matrix[0].length; // Number of columns in the matrix

        // Boolean arrays to track rows and columns that need to be set to zero
        boolean[] rows = new boolean[row];
        boolean[] cols = new boolean[col];

        // Step 1: Identify the rows and columns that need to be zeroed
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                if (matrix[i][j] == 0) 
                {
                    // Mark the row and column containing the zero
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Step 2: Zero out the identified rows
        for (int i = 0; i < row; i++) 
        {
            if (rows[i]) { // If this row needs to be zeroed
                for (int j = 0; j < col; j++) 
                {
                    matrix[i][j] = 0; // Set all elements in the row to zero
                }
            }
        }

        // Step 3: Zero out the identified columns
        for (int j = 0; j < col; j++) 
        {
            if (cols[j]) { // If this column needs to be zeroed
                for (int i = 0; i < row; i++) 
                {
                    matrix[i][j] = 0; // Set all elements in the column to zero
                }
            }
        }
    }
}
