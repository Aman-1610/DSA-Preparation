public class InstanceVariableExample {
    // Instance variables
    String name;  
    int age;

    // Constructor to initialize instance variables
    public InstanceVariableExample(String name, int age) {
        this.name = name; // Assigning the parameter value to the instance variable
        this.age = age;
    }

    // Method to display instance variable values
    public void displayDetails() {
        System.out.println("Name: " + name);  // Accessing instance variable
        System.out.println("Age: " + age);   // Accessing instance variable
    }

    public static void main(String[] args) {
        // Creating objects of the class
        InstanceVariableExample person1 = new InstanceVariableExample("Alice", 25);
        InstanceVariableExample person2 = new InstanceVariableExample("Bob", 30);

        // Calling methods using the objects
        System.out.println("Details of Person 1:");
        person1.displayDetails();

        System.out.println("\nDetails of Person 2:");
        person2.displayDetails();
    }
}
/*
 * Explanation of the Code
Instance Variables:

name and age are instance variables, declared at the class level but outside any method.
Each object of the class (person1 and person2) has its own copy of these instance variables.
Constructor:

The constructor initializes the instance variables with the values provided during object creation.
Methods:

The displayDetails method accesses and prints the instance variables name and age.
Objects:

Two objects, person1 and person2, are created with different values for name and age.

Key Points
Instance variables belong to the object (instance) of the class.
Each object has its own copy of instance variables.
They are initialized with default values if not explicitly assigned (e.g., null for objects, 0 for integers).
You can access them using this keyword when there is a name conflict with method parameters or local variables.
 */