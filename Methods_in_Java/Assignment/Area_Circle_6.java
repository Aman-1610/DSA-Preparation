//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.Scanner;
public class Area_Circle_6 
{
    public static void main (String args[])    
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Redius of the circle : ");
        double r = sc.nextDouble();
        double area = areaCircle(r);
        double circumference = circumferenceCircle(r);
        System.out.println("Area of the circle is : "+area);
        System.out.println("Circumference of the circle is : "+circumference);
    }
    static double areaCircle(double a)
    {
        return Math.PI * Math.pow(a,2);
    }
    static double circumferenceCircle(double a)
    {
        return 2*Math.PI*a;
    }
}
