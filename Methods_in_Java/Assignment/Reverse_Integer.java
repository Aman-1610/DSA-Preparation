
import java.util.*;
public class Reverse_Integer 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverse(x));
    }
    public static int reverse(int x)
    {
        int rev=0;
        while(x!=0)
        {
            rev = (rev*10)+(x%10);
            x = x/10;
            // Check for overflow or underflow
            if (rev > Integer.MAX_VALUE / 10 || 
                (rev == Integer.MAX_VALUE / 10 && x%10 > 7)) {
                return 0; // Overflow case
            }
            if (rev < Integer.MIN_VALUE / 10 || 
                (rev == Integer.MIN_VALUE / 10 && x%10 < -8)) {
                return 0; // Underflow case
            }
        }
        return rev;
    }
    

}
