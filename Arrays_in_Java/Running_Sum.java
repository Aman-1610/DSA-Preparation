
import java.util.*;
public class Running_Sum//1480 leetcode problem statement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(solution.runningSum(nums)));
    }
}
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}