# Concept of Variable Shadowing and Variable Hiding in Java

## Types of Variables in Java

### Local Variables
- Declared inside a method, constructor, or block.
- Accessible only within that scope.

### Instance Variables
- Declared inside a class but outside any method, constructor, or block.
- Associated with an instance of the class and are specific to the object.

### Class Variables
- Declared with the `static` keyword inside a class.
- Shared among all instances of the class.

---

## Variable Shadowing

Variable shadowing occurs when a local variable (or method parameter) has the same name as an instance variable. The local variable "shadows" the instance variable in its scope, meaning the local variable takes precedence when accessed within the method.

### Key Points About Shadowing:
1. When a variable is shadowed, the local variable is used instead of the instance variable.
2. To access the instance variable within the same method, you must use the `this` keyword.

### Example 1: Shadowing with Local Variables

```java
public class Shadowing {
    String car_name = "Ferrari"; // Instance variable
    double price = 50000000;     // Instance variable

    public void showCar() {
        String car_name = "Bugatti"; // Local variable
        long price = 43000000;       // Local variable
        System.out.println("Car Name: " + car_name); // Prints the local variable
        System.out.println("Price: " + price);       // Prints the local variable
    }

    public static void main(String args[]) {
        new Shadowing().showCar();
    }
}
```
# Output:
Car Name: Bugatti
Price: 43000000
##Explanation:
The local variables car_name and price declared inside the showCar() method shadow the instance variables with the same name.
The local variables are used in the method, and the instance variables are ignored unless explicitly accessed using this.
---
#Accessing Instance Variables Using this
```java
public class Shadowing {
    String car_name = "Ferrari"; // Instance variable
    long price = 50000000;       // Instance variable

    public void showCar() {
        String car_name = "Bugatti"; // Local variable
        long price = 43000000;       // Local variable
        System.out.println("Car Name: " + car_name);      // Local variable
        System.out.println("Price: " + price);            // Local variable
        System.out.println("Car Name: " + this.car_name); // Instance variable
        System.out.println("Price: " + this.price);       // Instance variable
    }

    public static void main(String args[]) {
        new Shadowing().showCar();
    }
}
```

#Output:
```java
Car Name: Bugatti
Price: 43000000
Car Name: Ferrari
Price: 50000000
```
##Explanation:
By using this.car_name and this.price, the instance variables are explicitly accessed, bypassing the shadowing caused by local variables.
---
#Variable Shadowing in Nested Classes
Shadowing can also occur in nested classes, where a variable in an inner class shadows a variable in the outer class.

```java
public class Shadow {
    public int x = 0; // Instance variable in the outer class

    class FirstLevel {
        public int x = 1; // Instance variable in the inner class

        void printValue(int x) { // Method parameter shadows all
            System.out.println("x = " + x);                // Local variable (method parameter)
            System.out.println("this.x = " + this.x);      // Instance variable of FirstLevel
            System.out.println("Shadow.this.x = " + Shadow.this.x); // Instance variable of outer class
        }
    }

    public static void main(String args[]) {
        Shadow shadow = new Shadow();
        Shadow.FirstLevel fl = shadow.new FirstLevel();
        fl.printValue(12);
    }
}
#Output:
```java
x = 12
this.x = 1
Shadow.this.x = 0

##Explanation:
1. x = 12:Refers to the method parameter x, shadowing all other variables with the same name in the class or instance.
2. this.x = 1:Refers to the instance variable x in the FirstLevel inner class.
Shadow.
3. this.x = 0:Refers to the instance variable x in the outer class Shadow.
---
#Key Takeaways
1. Shadowing occurs when a local variable or method parameter has the same name as an instance or outer class variable.
2. Local variables take precedence within their scope, shadowing instance or class variables.
3. Use the this keyword to access instance variables within the same class or inner class.
4. Use the OuterClassName.this.variableName syntax to access the instance variable of the outer class in a nested class.
---
##Example of Instance Variable
Instance variables are variables declared inside a class but outside any method, constructor, or block. They are associated with an instance of the class, and each instance has its own copy of these variables.

Here’s an example to demonstrate the concept:

```java
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
Explanation of the Code
Instance Variables:

name and age are instance variables, declared at the class level but outside any method.
Each object of the class (person1 and person2) has its own copy of these instance variables.
Constructor:

The constructor initializes the instance variables with the values provided during object creation.
Methods:

The displayDetails method accesses and prints the instance variables name and age.
Objects:

Two objects, person1 and person2, are created with different values for name and age.
Output
yaml
Copy code
Details of Person 1:
Name: Alice
Age: 25

Details of Person 2:
Name: Bob
Age: 30
Key Points
Instance variables belong to the object (instance) of the class.
Each object has its own copy of instance variables.
They are initialized with default values if not explicitly assigned (e.g., null for objects, 0 for integers).
You can access them using this keyword when there is a name conflict with method parameters or local variables.





You said:
local variable example 
ChatGPT said:
ChatGPT
Example of Local Variable
Local variables are variables declared inside a method, constructor, or block. They are created when the method is called and destroyed once the method execution is complete. They can only be accessed within the method or block where they are defined.

Code Example
java
Copy code
public class LocalVariableExample {

    public void displaySum() {
        // Local variables
        int num1 = 10; // Declared inside the method
        int num2 = 20;

        // Performing an operation using local variables
        int sum = num1 + num2;

        // Printing the result
        System.out.println("The sum of num1 and num2 is: " + sum);
    }

    public static void main(String[] args) {
        // Creating an object of the class
        LocalVariableExample example = new LocalVariableExample();

        // Calling the method
        example.displaySum();
    }
}
Explanation of the Code
Local Variables:

num1, num2, and sum are local variables.
They are declared inside the displaySum method and are accessible only within this method.
Scope:

The scope of these variables is limited to the displaySum method.
They are created when the method is called and destroyed once the method completes execution.
Output:

The method calculates the sum of num1 and num2 and prints it to the console.
Object Creation:

The example object is used to call the displaySum method.
Output
python
Copy code
The sum of num1 and num2 is: 30
Key Points
Local variables must be initialized before use, as they do not have default values.
They are created when the method or block starts and destroyed when it ends.
They cannot be accessed outside the method or block where they are declared.





You said:
class variable example
ChatGPT said:
ChatGPT
Example of Class Variable
Class variables (also known as static variables) are declared using the static keyword. They belong to the class rather than any specific object, meaning all instances of the class share the same variable. Class variables are loaded into memory when the class is loaded.

Code Example
java
Copy code
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
Explanation of the Code
Class Variable:

companyName is a static variable. It is shared among all objects of the class.
It is initialized once, and any change made to it is reflected across all objects.
Instance Variables:

employeeName and employeeId are instance variables, unique to each object.
Static Access:

companyName is accessed using the class name (ClassVariableExample.companyName) to show that it belongs to the class rather than a specific object.
Modification:

After modifying the companyName, the change is reflected for both emp1 and emp2.
Output
yaml
Copy code
Company Name (Accessed via Class): Tech Corp

Employee 1 Details:
Employee Name: Alice
Employee ID: 101
Company Name: Tech Corp

Employee 2 Details:
Employee Name: Bob
Employee ID: 102
Company Name: Tech Corp

After modifying the company name:

Employee 1 Details:
Employee Name: Alice
Employee ID: 101
Company Name: Next Gen Tech

Employee 2 Details:
Employee Name: Bob
Employee ID: 102
Company Name: Next Gen Tech
Key Points
Class variables are declared with the static keyword.
They are shared by all instances of the class.
They can be accessed using the class name, without creating an object.
Changes to class variables are reflected across all instances of the class.