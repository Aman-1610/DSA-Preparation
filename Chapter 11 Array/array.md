# Arrays in Java

The Java language provides a capability that enables the user to design a set of similar data types, called an array.

## What are arrays?

An array is a collection of similar elements, such as all `ints`, all `floats`, or all `chars`, etc.  
Usually, an array of characters is called a **string**, whereas an array of `ints` or `floats` is called simply an array.  
Remember that we cannot have an array of 10 numbers, of which 5 are `ints` and 5 are `floats`.

## Array Declaration

Like other variables, an array needs to be declared. In our program, we have done this with the statement:

```java
int[] marks;
```
This statement tells the compiler that 'marks' is a reference to an array of integers.

Once the reference to the array is declared, we have to allocate space for the array in memory. This is done using the statement:

```java
marks = new int[30];
```
This statement allocates space for 30 integers in memory and returns the base address (starting address) of this memory chunk.

## Where is it stored, in the heap or stack?
In Java, arrays are objects, and objects are stored in the heap memory. 
The reference variable 'marks' is stored in the stack memory, but the actual array elements are stored in the heap memory.

## Accessing Elements of an Array
Once an array is created, its individual elements can be accessed using the element's position in the array. All the arrays elemnts are counted, starting with 0.

## Entering data into an Array
```java
for ( i = 0 ; i <= 29 ; i++ ) 
{ 
System.out.println ( "Enter marks " ) ; 
marks[ i ] = scn.nextInt( ) ;  
}
```
First time through the loop, i has a value 0, so the first value read through nextInt( ) function will be stored in marks[ 0 ]. This process will be repeated 30 times till the last values gets stored at marks[ 29 ]. 

