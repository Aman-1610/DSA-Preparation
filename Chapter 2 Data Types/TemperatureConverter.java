/* Assume a suitable value for temperature of a city in Fahrenheit 
degrees. Write a Java program to convert this temperature into 
Centigrade degrees and print both temperatures. */

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        // Print both temperatures
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperature in Celsius: " + celsius + " °C");

        sc.close(); // Close the scanner
    }
}