/* Assignment 2 Q1
   Leet Code 561 */
class Solution 
{
    public int arrayPairSum(int[] nums) 
    {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0, j = 1; i < nums.length - 1 && j < nums.length; i += 2, j += 2)
        {
            sum += Math.min(nums[i], nums[j]);
        }
        return sum;
    }
}