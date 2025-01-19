//package Arrays_in_Java;
import java.util.*;
public class Syntax 
{
    public static void main (String args[])    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Student: ");
        int n = sc.nextInt();
        //Declaring an array of integers
        //Syntax 
        //datatype[] variable_name = new datatype[size];
        
        int[] arr = new int[n];
        System.out.println("Enter the roll numbers: ");
        for(int i=0;i<n;i++)//for loop is used for storing the element in an array
        {
            arr[i] = sc.nextInt();
        }
        // for(int i:arr)//for each method is mostly used for traversing an array
        // {
        // System.out.print(i);
        // }
        System.out.println("Roll numbers: "+Arrays.toString(arr));//Instead of using a for loop for printing all the element than we can use Arraylist method that is Arrays.toString(array_variable_name);
        /*
         * The toString() method is used for converting and representing an array into string form. 
         * It returns the string containing the specified array elements. 
         * Commas separate these elements, and the string does not affect the original array.
         */

         //array of objects
         System.out.println("Enter the names of student: ");
         String[] str = new String[n];
         for(int i = 0; i<str.length;i++)
         {
            str[i]=sc.next();
         }
         System.out.print("Names are: "+Arrays.toString(str));
    }
}
