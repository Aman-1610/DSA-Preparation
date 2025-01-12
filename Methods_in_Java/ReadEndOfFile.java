import java.io.*;
import java.util.*;

public class ReadEndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1; // Initialize line counter
        
        // Read lines until EOF
        while (scanner.hasNext()) {
            String line = scanner.nextLine(); // Read the next line
            System.out.println(lineNumber + " " + line); // Print line number and content
            lineNumber++; // Increment line counter
        }
        
        scanner.close(); // Close the scanner
    }
}