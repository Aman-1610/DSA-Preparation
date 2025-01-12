# Ambiguity in java
---
## Understanding Ambiguity:
Ambiguity, in the context of programming languagues, refers to the situations where the compiler or interpreter struggles to determine the correct meaning of a statement due to multiple possibilites. 
In java, ambiguity typically arises in two primary scenarios:
- Method Overloading 
- Multiple Inheritance
---
## Method Overloading:
Method overloading is a practice that allows a class to have multiple methods with the same name but different parameter lists. The compiler distinguishes between these methods based on the number or types of arguments they accept. However, ambiguity can arise when the compiler cannot definitively identify which overloaded method is invoked.
### code:
```java
class AmbiguityDemo {  
    void print(int x) {  
        System.out.println("Printing integer: " + x);  
    }  
    void print(double y) {  
        System.out.println("Printing double: " + y);  
    }  
    public static void main(String[] args) {  
        AmbiguityDemo demo = new AmbiguityDemo();  
        demo.print(5);  
    }  
}  
```
### Explanation:
In this case, if we call demo.print(5), the compiler will be uncertain about whether to invoke the print(int x) method or the print(double y) method, since both methods could potentially match the argument. This results in a compilation error due to ambiguity.
---
## Interface Inheritance Ambiguity:
Java allows a class to implement multiple interfaces. However, if these interfaces contain methods with the same signature but different return types, ambiguity can arise when implementing these methods in the concrete class.
### code:
```java
interface A
{
    int getValue();
}
interface B
{
    double getValue();
}
class AmbiguityClass implements A,B
{
    //which getValue() method should be implemented?
}
```
### Exxplanation:
In the above example, the class AmbiguityClass faces a problem when implementing the getValue() method. Since both interfaces provide conflicting return tyes for the same method signature, the compiler cannot determine which method to use, resulting in ambiguity.
---
## Resolving Ambiguity:
Resolving ambiguity is crucial to ensure code correctness and maintainability. Fortunately, Java provides mechanisms to handle these situations effectively.
### Method Overloading Resolution:
To resolve method overloading ambiguity, you can explicitly cast the argument to the desired data type:
```java
demo.print((double) 5);
```
### Explanation:
This tells the compiler which method to invoke, eliminating the ambiguity. Alternatively, you can modify the method signatures to have non-overlapping parameter types.