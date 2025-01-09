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

/*
 * Explanation of the Code
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

Key Points
Local variables must be initialized before use, as they do not have default values.
They are created when the method or block starts and destroyed when it ends.
They cannot be accessed outside the method or block where they are declared.
 */