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
The sort( ) function arranges the elements of the array in ascending 
order, whereas, the binarySearch( ) function searches for an element in 
the sorted array and reports its position in the array. The copyOf( )
function copies the contents of one array into another, whereas fill( ) 
function sets each array elements value to 0. You can watch these 
effects in the output of the program. All these functions are static 
functions, hence the syntax used to call them is classname.functioname( ). You can try your hand at other functions 
present in the Arrays class to get a hang of them. 

