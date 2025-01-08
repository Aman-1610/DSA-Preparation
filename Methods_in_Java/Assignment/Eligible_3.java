//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.Scanner;
public class Eligible_3 
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        String eligible = eligible(age);
        System.out.println("You are "+eligible);
    }
    static String eligible(int a)
    {
        if(a>=18)
        return "eligible";
        else
        return "not eligible";
    }
}
 