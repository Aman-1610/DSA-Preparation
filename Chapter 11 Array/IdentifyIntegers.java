/** Twenty five numbers are entered from the keyboard into an array. 
Write a program to find out how many of them are positive, how 
many are negative, how many are even and how many odd.   */
import java.util.Scanner;

public class IdentifyIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[25];

        // Input 25 numbers into the array
        System.out.println("Enter 25 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int countPositive = 0;
        int countNegative = 0;
        int countEven = 0;
        int countOdd = 0;

        // Process the array in a single loop
        for (int i = 0; i < arr.length; i++) {
            // Check for positive and negative
            if (arr[i] > 0) {
                countPositive++;
            } else if (arr[i] < 0) {
                countNegative++;
            }

            // Check for even and odd
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        // Output the results
        System.out.println("Number of positive integers: " + countPositive);
        System.out.println("Number of negative integers: " + countNegative);
        System.out.println("Number of even integers: " + countEven);
        System.out.println("Number of odd integers: " + countOdd);

        sc.close(); // Close the scanner
    }
}