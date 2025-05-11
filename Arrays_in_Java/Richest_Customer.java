
import java.util.*;
public class Richest_Customer 
{
    public static void main(String args[])    
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                accounts[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution.maximumWealth(accounts));
    }
}
class Solution 
{
    public int maximumWealth(int[][] accounts) 
    {
        int row = accounts.length;
        int col = accounts[0].length;
        int maxWealth = 0;
        for(int i=0;i<row;i++)
        {
            int sum = 0;
            for(int j=0;j<col;j++)
            {
                sum += accounts[i][j];
            }
            if(sum > maxWealth)
            {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}