public class Subsequences 
{
    public static void printSubsequences(String str, String current, int index) 
    {
        if (index == str.length()) 
        {
            System.out.println(current);
            return;
        }
        // Exclude the current character
        printSubsequences(str, current, index + 1);
        // Include the current character
        printSubsequences(str, current + str.charAt(index), index + 1);
    }
    public static void main(String[] args) 
    {
        String str = "payal";
        printSubsequences(str, "", 0);
    }
}

// // write a program to print all the subsequnces of an array using recursion
// public class Subsequences 
// {
//     public static void printSubsequences(int arr[], String current, int index) 
//     {
//         if (index == arr.length) 
//         {
//             System.out.println(current);
//             return;
//         }
//         // Exclude the current element
//         printSubsequences(arr, current, index + 1);
//         // Include the current element
//         printSubsequences(arr, current + arr[index] + " ", index + 1);
//     }
//     public static void main(String[] args) 
//     {
//         int arr[] = {1, 2, 3};
//         printSubsequences(arr, "", 0);
//     }
// }