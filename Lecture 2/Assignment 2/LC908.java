/* Assignment 2 Q8
   Leet code 908 */
class Solution 
{
    public int smallestRangeI(int[] nums, int k) 
    {
        int M = Integer.MIN_VALUE;
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++)
        {
            M = Math.max(M, nums[i]);
            m = Math.min(m, nums[i]);
        }
        if (M - k - (m + k) <= 0)
        {
            return 0;
        }
        return M - k - (m + k);
    }
}