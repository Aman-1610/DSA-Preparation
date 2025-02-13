/** Write a program to copy the contents of one array into another in 
the reverse order. 
 */

import java.util.*;
public class CopyArrayInReverse 
{
    public static void main(String args[])    
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int[] copyArr = new int[arr.length];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            copyArr[i]=arr[arr.length-1-i];
        }
        System.out.println("copied array in reverse order: "+Arrays.toString(copyArr));
    }
}
