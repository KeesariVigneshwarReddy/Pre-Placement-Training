/* Assignment 2 Q5
   Leet code 628 */
class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[2], Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3], nums[0] * nums[1] * nums[nums.length - 1]));
    }
}