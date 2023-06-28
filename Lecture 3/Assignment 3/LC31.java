/* Assignment 3
   Q3
   Leet code 31 */
class Solution 
{
    public void nextPermutation(int[] nums) 
    {
        int idx1 = -1, idx2 = -1;
        for (int i = nums.length - 2; i >= 0; i--)
        {
            if (nums[i] < nums[i + 1])
            {
                idx1 = i;
                break;
            }
        }
        if (idx1 == -1)
        {
            for (int i = 0, j = nums.length - 1; i < j; i++, j--)
            {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
            return;
        }
        for (int i = nums.length - 1; i >= 0; i--)
        {
            if (nums[i] > nums[idx1])
            {
                idx2 = i;
                break;
            }
        }
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
        for (int i = idx1 + 1, j = nums.length - 1; i < j; i++, j--)
        {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }
}