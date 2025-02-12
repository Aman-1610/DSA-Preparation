/* Let us try to write a program to find average marks obtained by a class of 30 students in a test? */

import java.util.*;
public class Average
{
    public static void main(String args[])
    {
        int i,avg,sum=0;
        int[] marks;//creation of an array of integer type with veriable name marks
        Scanner sc= new Scanner(System.in);
        marks = new int[30];//declaring the size of an array
        //store data in the array
        for(i=0;i<30;i++)
        {
            System.out.println("Enter marks: ");
            marks[i]=sc.nextInt();
        }
        //read data from the array
        for(i=0;i<30;i++)
        {
            sum=sum+marks[i];
        }
        avg=sum/30;
        System.out.println("Average marks= "+avg);
    }
}