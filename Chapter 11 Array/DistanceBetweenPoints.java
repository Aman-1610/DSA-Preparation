/* 
The X and Y coordinates of 10 different points are entered through 
the keyboard. Write a program to find the distance of last point 
from the first point (sum of distances between consecutive points).  */

import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPoints = 10;

        // Arrays to store X and Y coordinates
        double[] xCoords = new double[numPoints];
        double[] yCoords = new double[numPoints];

        // Input the coordinates of 10 points
        System.out.println("Enter the X and Y coordinates of 10 points:");
        for (int i = 0; i < numPoints; i++) {
            System.out.print("Point " + (i + 1) + " (x y): ");
            xCoords[i] = sc.nextDouble();
            yCoords[i] = sc.nextDouble();
        }

        // Calculate the total distance
        double totalDistance = 0;
        for (int i = 0; i < numPoints - 1; i++) {
            double distance = calculateDistance(xCoords[i], yCoords[i], xCoords[i + 1], yCoords[i + 1]);
            totalDistance += distance;
        }

        // Output the total distance
        System.out.println("Total distance from the first point to the last point: " + totalDistance);

        sc.close(); // Close the scanner
    }

    // Helper method to calculate the distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}