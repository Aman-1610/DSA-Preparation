public class Name 
{
    static void namePrinting(int count,int n)
    {
        if(count>n)
        {
            return;
        }
        System.out.println("Aman Kumar");
        //count++;
        namePrinting(count+1,n);
    }    
    public static void main(String args[])
    {
        namePrinting(1,5);
    }
}
//since, time complexity is BigO(n) because one function calls another functions n times
//since, Space complexity is also Big O(n) because the space is not utalized outside but internally it is occupying the stack memory n times
