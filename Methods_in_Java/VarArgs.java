/*
 * What are Varargs in Java?
Varargs allow a method to accept zero or more arguments of a specified type. This is useful when the number of arguments to pass is not fixed. 
Varargs are implemented using an array internally, and they are declared by placing three dots (...) after the data type.
 */
import java.util.Arrays;

public class VarArgs {
    public static void main(String args[]) {
        // Calling the 'fun' method with a variable number of integer arguments.
        fun(2, 3, 4, 56, 6, 6, 7, 88, 8);
        
        // Calling the 'multiple' method with fixed and variable arguments.
        multiple(23, 34, "Aman", "Kumar");
    }

    /**
     * Method demonstrating varargs with a fixed argument and a variable argument list.
     * The fixed arguments 'a' and 'b' are followed by a varargs parameter of type String.
     * 
     * @param a Fixed integer parameter.
     * @param b Fixed integer parameter.
     * @param i Varargs parameter accepting zero or more String arguments.
     */
    static void multiple(int a, int b, String ...i) {
        // Printing the varargs parameter as an array.
        System.out.println(Arrays.toString(i));
        // Printing the number of arguments passed in the varargs parameter.
        System.out.println("Number of arguments passed: " + i.length);
    }

    /**
     * Method demonstrating varargs with only a variable argument list of integers.
     * 
     * @param i Varargs parameter accepting zero or more integer arguments.
     */
    static void fun(int ...i) {
        // Printing the varargs parameter as an array.
        System.out.println(Arrays.toString(i));
        // Printing the number of arguments passed in the varargs parameter.
        System.out.println("Number of arguments passed: " + i.length);
    }
}
/*
 * # Key Points:
- Declaration: Varargs are declared using three dots (...) after the data type. For example: int ...i.
- Internally an Array: Varargs are treated as an array within the method.
# Position in Method Signature:
- A method can have only one varargs parameter.
- The varargs parameter must always be the last parameter in the method signature.
# Use Case: Varargs are useful when you need to pass a variable number of arguments to a method, such as when creating utility methods like logging, calculating sums, etc.
 */
