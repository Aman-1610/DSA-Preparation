/*
 *Intuition and Approach:
Intuition:

First, find the largest element in the array.
Then, traverse the array again to find the largest element that is not equal to the previously found largest element.
Approach:

Traverse the array to find the largest element (largest).
Traverse the array again to find the largest element smaller than largest (second_largest).
Edge Cases:

Array with fewer than 2 elements (e.g., {} or {5}).
Array where all elements are identical (e.g., {3, 3, 3}).
Time Complexity:

First loop: O(n)
Second loop: O(n)
Total: O(2n) = O(n).
Space Complexity:

No additional space used → O(1).

 */

public class Second_largest {
    public static void main(String args[]) {
        int arr[] = {1, 3, 2, 4, 6, 5};
        int n = arr.length;

        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        // Find the largest number
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Find the second largest number
        for (int i = 0; i < n; i++) {
            if (arr[i] > second_largest && arr[i] != largest) {
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
