// public class ReverseAnArray 
// {
//     private static void reverseArray(int arr[], int start, int end) 
//     {
//         if (start >= end) 
//         {
//             return;
//         }
//         // Swap the elements at the start and end indices
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;

//         // Recursively call the function for the next pair of elements
//         reverseArray(arr, start + 1, end - 1);
//     }   
//     public static void main(String[] args) 
//     {
//         int arr[] = {1, 2, 3, 4, 5};
//         int n = arr.length;
//         reverseArray(arr, 0, n - 1);
//         System.out.println("Reversed array: ");
//         for (int i : arr) 
//         {
//             System.out.print(i + " ");
//         }
//     }
// }

//reverse an array using recursion but with using only one veriable
public class ReverseAnArray 
{
    static void reverseArray(int arr[], int start) 
    {
        if (start >= arr.length / 2) 
        {
            return;
        }
        // Swap the elements at the start and end indices
        int temp = arr[start];
        arr[start] = arr[arr.length - 1 - start];
        arr[arr.length - 1 - start] = temp;

        // Recursively call the function for the next pair of elements
        reverseArray(arr, start + 1);
    }   
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 3, 4, 5};
        reverseArray(arr, 0);
        System.out.println("Reversed array: ");
        for (int i : arr) 
        {
            System.out.print(i + " ");
        }
    }
}