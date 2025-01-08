//Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.Scanner;
public class Palindrome_10 
{    
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (checkPalindrome(n)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    static boolean checkPalindrome(int n)
    {
        int reverse = 0;
        int original = n;//copy the original number so that the original number remains unchanged while finding the reverse number
        while(original != 0)
        {
            reverse = (reverse*10)+(original%10);
            original = original/10;
        }
        //if reverse is equal to the original number then the number is palindrome
        return (reverse == n);
    }
}
