/* Write a program that interchanges the odd and even elements values of 
an array. */
/** import java.util.*;

public class InterchangeOddEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the element of an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] % 2 == 0) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println("Elements after interchanging: " + Arrays.toString(arr));
        /**
         * for(int i=0;i<arr.length;i++)
         * {
         * System.out.println(Arrays.toString(arr));
         * }
         
    }
} */
import java.util.Arrays;
import java.util.Scanner;

public class InterchangeOddEvenValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        // Input 10 numbers into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Interchange odd and even values
        int left = 0; // Pointer for odd values
        int right = arr.length - 1; // Pointer for even values

        while (left < right) {
            // Move the left pointer to the right until an odd value is found
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // Move the right pointer to the left until an even value is found
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            // Swap the odd value at left with the even value at right
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Output the modified array
        System.out.println("Elements after interchanging odd and even values: " + Arrays.toString(arr));

        sc.close(); // Close the scanner
    }
}