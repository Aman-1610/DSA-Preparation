//This is the simple program for adding two numbers but if the user want to add the numbers 100 times then it is not possible to 
//copy paste the logic 100 times so instead of copy and paste we declare a method in java for reusing the codes number of times.
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of num1 and num2: "+sum);

      //  int ans = add();//calling the method here while calling the method the return value is also strored in the ans variable that is returned from the method
       // System.out.println("Sum of two numbers = "+ans);

       // add2();//method called and it does not return any value so we didn't used any variable for storing that
        add3(num1,num2);
        add3(40,900);
    }

    //pass the value of numbers when you are calling the method in main()

    static void add3(int a, int b)
    {
        int sum=a+b;
        System.out.println("Addition of a and b = "+sum);
    }

    /*
     * for declaring the method here is the structure given below
     * accessmodifier static return_type method_name(arguments)
     * {
     * body;
     * return stmt;
     * }
     */
    //return the value
    public static int add()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1=sc.nextInt();
        System.out.print("Enter the second number:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        return sum;//this method is going to return a integer value
    }
    //method without return value for this we need to use a void type
    static void add2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of num1 and num2: "+sum);
    }
}