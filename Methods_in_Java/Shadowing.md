Concept of Variable Shadowing and Variable Hiding in Java
1. Types of Variables in Java
Local Variables:
Declared inside a method, constructor, or block.
Accessible only within that scope.
Instance Variables:
Declared inside a class but outside any method, constructor, or block.
Associated with an instance of the class and are specific to the object.
Class Variables:
Declared with the static keyword inside a class.
Shared among all instances of the class.
Variable Shadowing
Variable shadowing occurs when a local variable (or method parameter) has the same name as an instance variable. The local variable "shadows" the instance variable in its scope, meaning the local variable takes precedence when accessed within the method.

Key Points About Shadowing:
When a variable is shadowed, the local variable is used instead of the instance variable.
To access the instance variable within the same method, you must use the this keyword.
Example 1: Shadowing with Local Variables
Code:
java
Copy code
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
Output:
yaml
Copy code
Car Name: Bugatti
Price: 43000000
Explanation:
The local variables car_name and price declared inside the showCar() method shadow the instance variables with the same name.
The local variables are used in the method, and the instance variables are ignored unless explicitly accessed using this.
Accessing Instance Variables Using this
Code:
java
Copy code
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
Output:
yaml
Copy code
Car Name: Bugatti
Price: 43000000
Car Name: Ferrari
Price: 50000000
Explanation:
By using this.car_name and this.price, the instance variables are explicitly accessed, bypassing the shadowing caused by local variables.
Variable Shadowing in Nested Classes
Shadowing can also occur in nested classes, where a variable in an inner class shadows a variable in the outer class.

Code:
java
Copy code
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
Output:
kotlin
Copy code
x = 12
this.x = 1
Shadow.this.x = 0
Explanation:
x = 12:

Refers to the method parameter x, shadowing all other variables with the same name in the class or instance.
this.x = 1:

Refers to the instance variable x in the FirstLevel inner class.
Shadow.this.x = 0:

Refers to the instance variable x in the outer class Shadow.
Key Takeaways
Shadowing occurs when a local variable or method parameter has the same name as an instance or outer class variable.
Local variables take precedence within their scope, shadowing instance or class variables.
Use the this keyword to access instance variables within the same class or inner class.
Use the OuterClassName.this.variableName syntax to access the instance variable of the outer class in a nested class.