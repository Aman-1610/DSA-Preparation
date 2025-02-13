
import java.util.*;
public class TransposeMatrix 
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        int rows=4,cols=4;
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the 4X4 matrix: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int[][] transpose = new int[cols][rows];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                transpose[j][i]=matrix[i][j];
            }
        }

        System.out.println("Original Matrix: ");
        printMatrix(matrix);

        System.out.println("Transposed Matrix: ");
        printMatrix(transpose);

    }
    public static void printMatrix(int[][] matrix)
    {
        for(int[] row:matrix)
        {
            for(int element:row)
            {
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
