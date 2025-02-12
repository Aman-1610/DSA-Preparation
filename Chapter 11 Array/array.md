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

## Storing value while declaring an array
```java
int[  ]  ages = new int[  ] { 32, 24, 31, 25, 26 } ; 
float[  ]  press = { 12.3f, 34.2f, -23.4f, -11.3f } ; 
int[  ] num = { 2, 4, 1, 5, 6, 3 } ; 
```
## Array Access
In java we can access array elements using any of the following three methods:
```java
int[ ] marks = { 55, 65, 75, 56, 78, 78, 90 } ; 
int i ; 
// method 1  
for ( i = 0 ; i <= 6 ; i++ )  
System.out.print ( marks[ i ] + "  " ) ; 
// method 2  
for ( i = 0 ; i <= marks.length - 1 ; i++ )  
System.out.print ( marks[ i ] + "  " ) ; 
// method 3  
for ( int j : marks )  
System.out.print ( j + "  " ) ;
```
## Passing Array Elements to a function
Like normal variables, we can also pass array elements to a function.
```java
public class PassingArrayElementsProject 
{ 
        public static void main ( String[ ] args ) 
        { 
  int [ ] marks = { 55, 65, 75, 56, 78, 78, 90 } ; 
  int i ; 
 
  for ( i = 0 ; i <= 6 ; i++ ) 
   modify ( marks[ i ] ) ; 
 
  for ( i = 0 ; i <= 6 ; i++ ) 
   System.out.println ( marks[ i ] ) ; 
        } 
        static void modify ( int  m ) 
        { 
                m = m * 2 ; 
        } 
} 
```
Output
```java

55  65  75  56  78  78  90 
```
Here, we are passing an individual array element at a time to the function modify( ). Since at a time only one element is being passed, this element is collected in an integer variable m. Even though we are doubling each element received in m in the modify( ), on return when 
we print all array elements we find that they have not been doubled at all. This is because we passed each array element by value.  

## Passing Array Reference to a Function
If we want that the modifications we make in the modify( ) function should be reflected back in main( ), then we need to pass the reference to the array, instead of passing each individual element. This is shown in 
the following program:
```java
public class PassArrayReferenceProject 
{ 
public static void main ( String[ ] args ) 
{ 
int[ ] marks = { 55, 65, 75, 56, 78, 78, 90 } ; 
int i ; 
modify ( marks ) ; 
for ( i = 0 ; i <= marks.length - 1 ; i++ ) 
System.out.print ( marks[ i ] + " " ) ; 
} 
static void modify ( int[ ] m ) 
{ 
int i ; 
for ( i = 0 ; i <= m.length - 1 ; i++ ) 
m[ i ] = m[ i ] * 2 ; 
} 
} 
```
Output
```java
110 130 150 112 156 156 180 
```
The array reference passed to modify( ) is collected in another array reference m. m is a reference to the same array, as it contains the same address that is present in marks. Using this reference when we modify the array elements we are changing the array that we defined in main( ). So once control returns to main( ), using marks when we print this array we find that the array elements stand doubled. 

## Returning an Array
```java
public class ReturningArrayProject 
{ 
public static void main ( String[ ] args ) 
{ 
int[ ] p ; 
p = func( ) ; 
for ( int i = 0 ; i <= p.length - 1 ; i++ ) 
System.out.println ( p[ i ] + " " ) ; 
} 
static int[ ] func( ) 
{ 
int [ ] arr = { 10, 20, 30, 40, 50 } ; 
return arr ; 
} 
} 
```
Here the reference to the array arr is returned from func( ) and collected in reference p in main( ). Using this reference when we iterate through the array in the for loop we are able to access all the elements of arr.

