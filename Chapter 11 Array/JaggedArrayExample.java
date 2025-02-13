import java.util.Arrays;

public class JaggedArrayExample {
    public static void main(String[] args) {
        // Create the jagged array
        int[][][] jaggedArray = new int[2][][];

        // Initialize the first 2D array
        jaggedArray[0] = new int[][] {
            {1, 2, 3, 4},       // Row 1 with 4 elements
            {5, 6, 7},          // Row 2 with 3 elements
            {8, 9}             // Row 3 with 2 elements
        };

        // Initialize the second 2D array
        jaggedArray[1] = new int[][] {
            {10, 11, 12},      // Row 1 with 3 elements
            {13, 14, 15, 16}   // Row 2 with 4 elements
        };

        // Display the jagged array
        System.out.println("Jagged Array:");
        System.out.println(Arrays.deepToString(jaggedArray));
    }
}