/*
 * Intuition and Approach:
Intuition:

The problem requires finding the second-largest element efficiently without sorting the array or using additional data structures.
To achieve this in a single pass, we maintain two variables: largest and second_largest.
By comparing the current element with these two variables, we can determine their values in one iteration.
Approach:

Initialize largest and second_largest to the smallest possible integer value (Integer.MIN_VALUE).
Traverse the array:
If the current element is greater than largest, update second_largest to largest and largest to the current element.
Otherwise, if the current element is greater than second_largest but not equal to largest, update second_largest.
After the loop:
If second_largest remains Integer.MIN_VALUE, it indicates that no second-largest value exists (e.g., all elements are identical).
Otherwise, print the second_largest value.
Time Complexity:

The loop runs once over the array → O(n).
Space Complexity:

No additional data structures are used → O(1).
 */

public class Second_largest_Optimal {
    public static void main(String[] args) {
        int arr[] = {1, 3, 200, 4, 6, 5};
        int n = arr.length;

        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        // Initialize to smallest possible integer values
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second_largest = largest; // Update second largest
                largest = arr[i];        // Update largest
            } else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }

        if (second_largest == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists (all elements might be identical).");
        } else {
            System.out.println("Second largest number is: " + second_largest);
        }
    }
}
