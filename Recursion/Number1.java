// public class Number1 //printing number from n to 1 means backward
// {
//     static void numberPrinting(int i,int n)    
//     {
//         if(n<i)
//         {
//             return;
//         }
//         System.out.println(n);
//         numberPrinting(i,n-1);
//     }
//     public static void main(String[] args)
//     {
//         numberPrinting(1,10);
//     }
// }

// print the backward counting but not to use n-1 use backtracking

public class Number1
{
    static void numberPrinting(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        numberPrinting(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args)
    {
        numberPrinting(1,3);
    }
}