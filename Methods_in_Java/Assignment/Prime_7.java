//Define a method to find out if a number is prime or not.
import java.util.Scanner;
public class Prime_7 
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        String prime = prime(num);
        System.out.println("The number is : "+prime);
    }
    static String prime(int a)
    {
        int count=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return "Prime";
        }
        else 
        return "Not Prime";
    }
}
