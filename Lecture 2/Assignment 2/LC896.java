/* Assignment 2 Q7
   Leet code 896 */
class Solution 
{
    public boolean one(int nums[])
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] > nums[i + 1])
            {
                return false;
            }
        }
        return true;
    }
    public boolean two(int nums[])
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] < nums[i + 1])
            {
                return false;
            }
        }
        return true;
    }
    public boolean isMonotonic(int[] nums) 
    {
        if (one(nums) || two(nums))
        {
            return true;
        }
        return false;
    }
}