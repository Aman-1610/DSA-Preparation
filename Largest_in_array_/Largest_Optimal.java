/*Recursive Approach 
 * Solution2: Using a max variable
 * 
Intuition:
We can maintain a max variable that will update whenever the current value is greater than the value in the max variable.  

Approach: 
Create a max variable and initialize it with arr[0].
Use a for loop and compare it with other elements of the array
If any element is greater than the max value, update max value with the element’s value
Print the max variable.

Time complexity: O(N)
Space complexity: O(1)
 */

public class Largest_Optimal 
{
    public static void main(String args[])
    {
        int arr[]={1,2,4,3,5,6};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("Largest element is: "+largest);
    }
}
