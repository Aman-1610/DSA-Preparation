// public class SumOfFirstNNumber //done in parametrized form
// {
    
//     static void sumessionOfNNumber(int n,int sum)
//     {
//         if(n<0)
//         {
//             System.out.println(sum);
//             return;
//         }
//         //sum+=i;
//         sumessionOfNNumber( n-1,sum+n);
        
//     }
//     public static void main(String[] args)
//     {
//         sumessionOfNNumber(3,0);
//     }
// }

//Let's do it in functional form
public class SumOfFirstNNumber
{
    static int sumessionOfNNumber(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sumessionOfNNumber(n-1);
    }
    public static void main(String args[])
    {
        int n=3;
        System.out.println(sumessionOfNNumber(n));
    }
}
