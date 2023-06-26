/* Assignment 1 Q6
   Leet code 217 */
class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        HashMap<Integer, Integer> HM = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            HM.put(nums[i], HM.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer key : HM.keySet())
        {
            if (HM.get(key) > 1)
            {
                return true;
            }
        }
        return false;
    }
}