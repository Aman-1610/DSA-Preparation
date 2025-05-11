// public class Patterns 
// {
//     static void printPattern(int n, int i, int j) 
//     {
//         if (i > n) 
//         {
//             return;
//         }
//         if (j > i) 
//         {
//             System.out.println();
//             printPattern(n, i + 1, 1);
//             return;
//         }
//         System.out.print("P ");
//         printPattern(n, i, j + 1);
//     }

//     public static void main(String[] args) 
//     {
//         int n = 5;
//         printPattern(n, 1, 1);
//     }
// }

//pateern 2 full pyramid
public class Patterns 
{
   //full pyramid means space than payal than space wrong
//    *   
//   ***  
//  ***** 
// *******
    //this is the pattern of full pyramid
     static void printPattern(int n, int i, int j) 
     {
          if (i > n) 
          {
                return;
          }
          if (j > i) 
          {
                System.out.println();
                printPattern(n, i + 1, 1);
                return;
          }
          System.out.print("P ");
          printPattern(n, i, j + 1);
     }
    
     public static void main(String[] args) 
     {
          int n = 5;
          printPattern(n, 1, 1);
     }
}