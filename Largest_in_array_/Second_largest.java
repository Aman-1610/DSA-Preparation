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
