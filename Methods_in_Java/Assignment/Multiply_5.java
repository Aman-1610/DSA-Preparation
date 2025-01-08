//Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;
public class Multiply_5 
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the second number : ");
        float num2 = sc.nextFloat();
        float result = multiply(num1,num2);
        System.out.print("Multiplication of two number is : "+result);
    }
    static float multiply(float a,float b)
    {
        return a*b;
    }
}
