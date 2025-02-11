/* Assume a suitable value for distance between two cities (in km.). 
Write a Java program to convert and print this distance in meters, 
feet, inches and centimeters. 
 */

 import java.util.Scanner;

 public class DistanceConversion {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
 
         // Input distance in kilometers
         System.out.print("Enter the distance between two cities (in kilometers): ");
         double distanceInKm = sc.nextDouble();
 
         // Conversion factors
         final double METERS_PER_KM = 1000;
         final double FEET_PER_KM = 3280.8399;
         final double INCHES_PER_KM = 39370.0787;
         final double CENTIMETERS_PER_KM = 100000;
 
         // Convert distance
         double distanceInMeters = distanceInKm * METERS_PER_KM;
         double distanceInFeet = distanceInKm * FEET_PER_KM;
         double distanceInInches = distanceInKm * INCHES_PER_KM;
         double distanceInCentimeters = distanceInKm * CENTIMETERS_PER_KM;
 
         // Display results
         System.out.println("Distance in meters: " + distanceInMeters);
         System.out.println("Distance in feet: " + distanceInFeet);
         System.out.println("Distance in inches: " + distanceInInches);
         System.out.println("Distance in centimeters: " + distanceInCentimeters);
 
         sc.close();
     }
 }
