
import java.util.Scanner;
public class Swap 
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1= sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Number before Swapping: num1 = "+num1+"num2 = "+num2);
        temp(num1,num2);
    }
    static void temp(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Number after Swapping: num1 = "+a+"num2 = "+b);
    }
}
