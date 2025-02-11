
import java.util.*;
public class Concatenation_of_Array // 1929 leetcode problem statement
{
    public static void main(String args[])    
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(solution.getConcatenation(nums)));
        
    }
}
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        // Populate the ans array
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];         // First half
            ans[i + n] = nums[i];     // Second half
        }

        return ans;
    }
}