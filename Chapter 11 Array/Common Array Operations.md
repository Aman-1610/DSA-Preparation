# Common Array Operations
There are certain operations that are very commonly carried out on arrays. For example, rearranging array elements in ascending or descending order, or searching an element in an array, etc. To carry out these operations the Java Library provides a class called Arrays.

```java
import java.util.* ; 
public class MoreArrayOperationsProject 
{ 
public static void main ( String[ ] args ) 
{ 
int [ ] arr = { 23, 45, 11, 54, 89, 32 } ; 
int i ;
System.out.println ( "Original array" ) ; 
  for ( i = 0 ; i < arr.length ; i++ ) 
   System.out.print ( arr[ i ] + " " ) ; 
 
  Arrays.sort ( arr ) ; 
  System.out.println ( "\nSorted array" ) ; 
  for ( i = 0 ; i < arr.length ; i++ ) 
   System.out.print ( arr[ i ] + " " ) ; 
 
  int index = Arrays.binarySearch ( arr, 54 ) ; 
  System.out.println ( "\nElement 54 found at "+ index ) ; 
 
  int[ ] newarr = new int[ 6 ] ; 
  newarr = Arrays.copyOf ( arr, arr.length ) ; 
  System.out.println ( "New array contents" ) ; 
  for ( i = 0 ; i < newarr.length ; i++ ) 
   System.out.print ( newarr[ i ] + " " ) ; 
 
  Arrays.fill ( arr, 0 ) ; 
  System.out.println ( "\nCleared array" ) ; 
  for ( i = 0; i < arr.length; i++ ) 
   System.out.print ( arr[ i ] + " " ) ; 
  System.out.println( ); 
 } 
} 
```
Output
```java
Original array 
23 45 11 54 89 32  
Sorted array 
11 23 32 45 54 89  
Element 54 found at 4 
New array contents 
11 23 32 45 54 89  
Cleared array 
0 0 0 0 0 0  
```
