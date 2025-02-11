import java.util.*;
public class Build_Array_Permutation //1920 Leetcode
{
    public static void main(String args[])    
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int[] nums = new int[m];
        for(int i=0;i<m;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(solution.buildArray(nums)));//using Arrays.toString method for printing the elements of an array in the readable format.
    }
}
class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}