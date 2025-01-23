
import java.util.*;
public class Search_2D_Matrix 
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println(solution.searchMatrix(matrix, target));
    }
}
class Solution
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}