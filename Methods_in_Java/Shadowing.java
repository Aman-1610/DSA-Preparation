public class Shadowing 
{
    static int x =90;//class variable
    public static void main (String args[])    
    {
        System.out.println(x);//90
        int x;//the class variable at line 4 is shadowed by this initialization
       // System.out.println(x);//scope will begin when values is initilised
        x=40;//local variable
        System.out.println(x);//40
        fun();
    }
    static void fun()
    {
        System.out.println(x);//90
    }
}
/*
 * Step-by-Step Analysis
1. Static Variable Declaration (Line 4)
java
Copy code
static int x = 90; // Class variable
A static variable x is declared and initialized with a value of 90.
This variable is a class-level variable, and it is accessible in all static methods of the class (e.g., main() and fun()).
2. Printing the Static Variable (Line 7)
java
Copy code
System.out.println(x); // Prints 90
Since x has not been redefined within the scope of the main() method yet, it refers to the class-level static variable x, which holds the value 90.
3. Declaration of a Local Variable x (Line 8)
java
Copy code
int x; // Declaring a local variable
A local variable x is declared but not initialized.
At this point, the class-level static variable x is shadowed by the local variable x within the scope of the main() method.
Important: The local variable x must be initialized before it can be used.
4. Uncommenting the Line (Line 9)
java
Copy code
// System.out.println(x); // ERROR
If this line is uncommented, the compiler will throw an error:
vbnet
Copy code
Variable 'x' might not have been initialized
This happens because the local variable x (declared in line 8) has not been initialized, and Java does not allow the use of uninitialized local variables.
5. Initializing the Local Variable x (Line 10)
java
Copy code
x = 40; // Local variable
The local variable x is now initialized with a value of 40.
From this point onward, the local variable x shadows the class-level static variable x within the scope of the main() method.
6. Printing the Local Variable (Line 11)
java
Copy code
System.out.println(x); // Prints 40
Since the local variable x is in scope and initialized, this line prints the value of the local variable x, which is 40.
7. Calling the fun() Method (Line 12)
java
Copy code
fun();
The method fun() is called.
The fun() method does not have a local variable x, so it uses the class-level static variable x.
8. Printing x Inside fun() (Line 15)
java
Copy code
System.out.println(x); // Prints 90
Inside the fun() method, there is no local variable x. Therefore, it refers to the class-level static variable x, which has a value of 90.
Key Takeaways
Variable Shadowing:

The local variable x in the main() method shadows the class-level static variable x within the scope of the main() method.
After declaring the local variable, any reference to x within main() refers to the local variable.
Uninitialized Local Variables:

Local variables must be initialized before use. Failing to do so results in a compile-time error.
Class-Level Static Variables:

Static variables are accessible throughout the class unless shadowed by a local variable of the same name.
Scope of Variables:

A variable's scope determines its visibility and precedence. In this example:
Local variable x takes precedence over the class-level static variable x in main().
The class-level static variable x is accessible in methods like fun() where no local variable x exists.
Program Output
Copy code
90
40
90
 */