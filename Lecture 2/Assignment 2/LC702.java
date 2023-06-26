/* Assignment 2 Q6
   Leet code 704 */
class Solution 
{
    public int search(int[] nums, int target) 
    {
        int L = 0;
        int H = nums.length - 1;
        while (L <= H)
        {
            int M = L + (H - L) / 2;
            if (nums[M] == target)
            {
                return M;
            }
            else if (nums[M] > target)
            {
                H = M - 1;
            }
            else
            {
                L = M + 1;
            }
        }    
        return -1;
    }
}