public class Second_largest 
{
    public static void main(String args[])    
    {
        int arr[]={1,3,2,4,6,5};
        int n=arr.length;
        int largest=0;
        int second_largest=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>second_largest && arr[i]!=largest)
            {
                second_largest=arr[i];//second_largest=1,second_largest=3,
            }
        }
        System.out.println("Second largest number is : "+second_largest);
    }
}
