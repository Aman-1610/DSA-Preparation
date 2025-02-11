/* Assume a suitable value for c salary. His dearness 
allowance is 40% of basic salary, and house rent allowance is 20% of 
basic salary. Write a Java program to calculate his gross salary.  */

import java.util.*;

public class GrossSalary 
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic pay: ");
        int basicSalary = sc.nextInt();
        float dearnessAllowance = (40.0f / 100) * basicSalary;  // Use 40.0f for floating-point division
        float homeRentAllowance = (20.0f / 100) * basicSalary; // Use 20.0f for floating-point division
        float grossSalary = basicSalary + dearnessAllowance + homeRentAllowance;
        System.out.println("Gross salary: " + grossSalary);
    }
}