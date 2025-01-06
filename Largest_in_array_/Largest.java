/*Brute Approch
 * Solution1: Sorting
 * 
Intuition:
We can sort the array in ascending order, hence the largest element will be at the last index of the array. 

Approach: 
Sort the array in ascending order.
Print the (size of the array -1)th index.

Time Complexity: O(N*log(N))
Space complexity: O(1)
 */
import java.util.Arrays;

public class Largest
{
    public static void main(String args[])    
    {
        int arr[]={1,2,4,3,6,5};
        System.out.println("Largest element in an array is : "+sort(arr));
    }
    static int sort(int arr[])
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
