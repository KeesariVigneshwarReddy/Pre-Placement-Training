/* Assignment 3 
   Q1
   Leet code 16 */
class Solution 
{
    public int threeSumClosest(int[] nums, int target) 
    {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        int closest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++)
        {
            int L = i + 1;
            int H = nums.length - 1;
            while (L < H)
            {
                int threeSum = nums[i] + nums[L] + nums[H];
                if (threeSum == target)
                {
                    return threeSum;
                }
                else if (threeSum < target)
                {
                    L++;
                }
                else
                {
                    H--;
                }
                int difference = Math.abs(threeSum - target);
                if (difference < closest) 
                { 
                    result = threeSum;
                    closest = difference;
                }
            }
        }
        return result;
    }
}