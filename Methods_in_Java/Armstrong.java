
import java.util.*;
import java.io.*;
public class Armstrong {
    public static void main(String args[])
    {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the number: ");
        //int num = sc.nextInt();
        // boolean armstrong = armstrong(num);
        // System.out.println("The given number is Armstrong: "+armstrong);
        for(int num=100;num<1000;num++) {
        if(armstrong(num))
        System.out.println(num);
        }
    }
    static boolean armstrong(int n)
    {
        int sum=0;
        int temp=n;
        while(temp>0)
        {
            int r=temp%10;
            sum = ((r*r*r)+sum);
            temp=temp/10;
        }
        return sum==n;
    }
}
