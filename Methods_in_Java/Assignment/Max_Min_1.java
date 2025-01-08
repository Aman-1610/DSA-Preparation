//1.Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;
public class Max_Min_1 
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter the third number:");
        int num3=sc.nextInt();
        int max = max(num1,num2,num3);
        System.out.println("Maximum number is: "+max);
        int min = min(num1,num2,num3);
        System.out.println("Minimum number is : "+min);
    }
    static int max(int ...i)
    {
        int max=0;
        for(int j:i)
        {
            if(j>max)
            {
                max=j;
            }
        }
        return max;
    }
    static int min(int ...i)
    {
        int min=i[0];
        for (int j:i)
        {
            if(j<min)
            {
                min=j;
            }
        }
        return min;
    }
}
