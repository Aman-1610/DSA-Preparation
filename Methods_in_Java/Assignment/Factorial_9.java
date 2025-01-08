/*
 * Write a program to print the factorial of a number by defining a method named 'Factorial'. 
 * Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1
 */
import java.util.Scanner;
public class Factorial_9 
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of number: "+factorial(n));
    }
    static int factorial(int a)
    {
        int fac=1;
        if(a==0 || a==1)
        {
            return fac;
        }
        for(int i=1;i<=a;i++)
        {
            fac=fac*i;
        }
        return fac;
    }
}
