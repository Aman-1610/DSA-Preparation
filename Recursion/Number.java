// public class Number //printing number from 1 to n
// {
//     static void numberPrinting(int i,int n)
//     {
//         if(i>n)
//         {
//             return;
//         }
//         System.out.println(i);
//         numberPrinting(i+1, n);
//     }
//     public static void main(String[] args)    
//     {
//         numberPrinting(1,10);
//     }
// }

//since we have to print from 1 to n but we don't want to use i+1
//Let's solve by backtracking

public class Number
{
    static void numberPrinting(int i,int n)
    {
        if(i<1)
        {
            return;
        }
        numberPrinting(i-1,n);
        System.out.println(i);
    }
    public static void main(String args[])
    {
        numberPrinting(10,10);
    }
}
