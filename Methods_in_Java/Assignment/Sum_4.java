//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;
public class Sum_4 
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        int sum = add(num1,num2);
        System.out.println("Sum of two numbers is: "+sum);
    }
    static int add(int a,int b)
    {
        return a+b;
    }
}
