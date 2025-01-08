//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;
public class Even_Odd_2 
{
    public static void main(String args[])    
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        String even_odd = evenOdd(num);
        System.out.println("The number is: "+even_odd);
    }
    static String evenOdd(int a)
    {
        if(a%2==0)
        {
            return "Even";
        }
        else
        {
            return "Odd";
        }
    }
}
