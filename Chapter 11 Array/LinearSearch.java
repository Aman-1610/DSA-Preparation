/** Twenty-five numbers are entered from the keyboard into an array. 
The number to be searched is entered through the keyboard by the 
user. Write a program to find if the number to be searched is 
present in the array and if it is present, display the number of times 
it appears in the array.  */
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[25];

        // Input 25 numbers into the array
        System.out.println("Enter 25 numbers into the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the number to be searched
        System.out.println("Enter the number to be searched:");
        int searchNumber = sc.nextInt();

        int count = 0;
        boolean isFound = false;

        // Search for the number in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNumber) {
                count++;
                isFound = true;
                System.out.println("Number found at index: " + i);
            }
        }

        // Display the result
        if (isFound) {
            System.out.println("Number of times the number is present in the array: " + count);
        } else {
            System.out.println("Number not found in the array.");
        }

        sc.close(); // Close the scanner
    }
}