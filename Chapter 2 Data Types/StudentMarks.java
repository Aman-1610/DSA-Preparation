/* Assume suitable values for marks obtained by a student in five 
different subjects are input through the keyboard. Write a Java 
program to find out the aggregate marks and percentage marks 
obtained by the student. Assume that the maximum marks that can 
be obtained by a student in each subject is 100. */

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for five subjects
        System.out.print("Enter marks for Subject 1 (out of 100): ");
        int subject1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2 (out of 100): ");
        int subject2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3 (out of 100): ");
        int subject3 = sc.nextInt();

        System.out.print("Enter marks for Subject 4 (out of 100): ");
        int subject4 = sc.nextInt();

        System.out.print("Enter marks for Subject 5 (out of 100): ");
        int subject5 = sc.nextInt();

        // Calculate aggregate marks
        int aggregateMarks = subject1 + subject2 + subject3 + subject4 + subject5;

        // Calculate percentage marks
        double percentageMarks = (aggregateMarks / 500.0) * 100;

        // Display results
        System.out.println("Aggregate Marks: " + aggregateMarks);
        System.out.println("Percentage Marks: " + percentageMarks + "%");

        sc.close();
    }
}