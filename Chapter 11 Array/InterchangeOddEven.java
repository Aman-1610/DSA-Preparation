/* Interchanging the positions value  */
import java.util.Arrays;
import java.util.Scanner;

public class InterchangeOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        // Input 10 numbers into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Interchange odd and even positions
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        // Output the modified array
        System.out.println("Elements after interchanging: " + Arrays.toString(arr));

        sc.close(); // Close the scanner
    }
}