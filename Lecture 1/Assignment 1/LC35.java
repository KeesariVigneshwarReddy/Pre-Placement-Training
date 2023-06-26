/* Assignment 1 Q3
   Leet Code 35   */
class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int L = 0;
        int H = nums.length - 1;
        if (nums[nums.length - 1] < target)
        {
            return nums.length;
        }
        if (nums[0] > target)
        {
            return 0;
        }
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
        L = 0;
        H = nums.length - 1;
        int M = -1;
        while (L < H)
        {
            if (H - L == 1)
            {
                return L + 1;
            }
            M = L + (H - L) / 2;
            if (nums[M] > target)
            {
                H = M;
            }
            else
            {
                L = M;
            }
        }
        return -1;
    }
}