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
