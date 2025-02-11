/** Assume suitable values for length and breadth of a rectangle, and 
radius of a circle. Write a Java program to calculate the area and 
perimeter of the rectangle, and the area and circumference of the 
circle. */

import java.util.Scanner;

public class RectangleandCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        // Input for circle
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Constants
        final double PI = 3.14159;

        // Calculate rectangle area and perimeter
        double rectangleArea = length * breadth;
        double rectanglePerimeter = 2 * (length + breadth);

        // Calculate circle area and circumference
        double circleArea = PI * radius * radius;
        double circleCircumference = 2 * PI * radius;

        // Output results
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangleArea);
        System.out.println("Perimeter: " + rectanglePerimeter);

        System.out.println("\nCircle:");
        System.out.println("Area: " + circleArea);
        System.out.println("Circumference: " + circleCircumference);

        sc.close(); // Close the scanner
    }
}