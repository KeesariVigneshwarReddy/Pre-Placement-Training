/* Assignment 2 Q3
   Leet code 594 */
class Solution 
{
    public int findLHS(int[] nums) 
    {
        int max = 0;
        HashMap<Integer, Integer> HM = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            HM.put(nums[i], HM.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer key : HM.keySet())
        {
            if (HM.containsKey(key + 1))
            {
                max = Math.max(max, HM.get(key) + HM.get(key + 1));
            }
        }
        return max;
    }
}