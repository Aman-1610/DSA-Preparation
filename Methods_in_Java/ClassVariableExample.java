public class ClassVariableExample {
    // Class variable (static variable)
    static String companyName = "Tech Corp";

    // Instance variables
    String employeeName;
    int employeeId;

    // Constructor to initialize instance variables
    public ClassVariableExample(String name, int id) {
        this.employeeName = name;
        this.employeeId = id;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        // Accessing the class variable
        System.out.println("Company Name: " + companyName);
    }

    public static void main(String[] args) {
        // Creating objects of the class
        ClassVariableExample emp1 = new ClassVariableExample("Alice", 101);
        ClassVariableExample emp2 = new ClassVariableExample("Bob", 102);

        // Accessing class variable using the class name
        System.out.println("Company Name (Accessed via Class): " + ClassVariableExample.companyName);

        System.out.println("\nEmployee 1 Details:");
        emp1.displayDetails();

        System.out.println("\nEmployee 2 Details:");
        emp2.displayDetails();

        // Modifying the class variable
        ClassVariableExample.companyName = "Next Gen Tech";

        System.out.println("\nAfter modifying the company name:");

        System.out.println("\nEmployee 1 Details:");
        emp1.displayDetails();

        System.out.println("\nEmployee 2 Details:");
        emp2.displayDetails();
    }
}

/*
 * Explanation of the Code
Class Variable:

companyName is a static variable. It is shared among all objects of the class.
It is initialized once, and any change made to it is reflected across all objects.
Instance Variables:

employeeName and employeeId are instance variables, unique to each object.
Static Access:

companyName is accessed using the class name (ClassVariableExample.companyName) to show that it belongs to the class rather than a specific object.
Modification:

After modifying the companyName, the change is reflected for both emp1 and emp2.

Key Points
Class variables are declared with the static keyword.
They are shared by all instances of the class.
They can be accessed using the class name, without creating an object.
Changes to class variables are reflected across all instances of the class.
 */