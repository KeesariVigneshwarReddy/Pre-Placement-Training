/* Assignment 3
   Q2
   Leet code 18 */
class Solution 
{
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        Arrays.sort(nums);
        HashSet<List<Integer>> HS = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++)
        {
            for (int j = i + 1; j < nums.length - 2; j++)
            {
                int L = j + 1;
                int H = nums.length - 1;
                while(L < H)
                {
                    long fourSum =  (long)nums[i] + (long)nums[j] + (long)nums[L] + (long)nums[H];
                    if (fourSum == (long)target)
                    {
                        HS.add(Arrays.asList(nums[i], nums[j], nums[L], nums[H]));
                        L++;
                        H--;
                    }
                    else if (fourSum < target)
                    {
                        L++;
                    }
                    else
                    {
                        H--;
                    }
                }
            }
        }
        return new ArrayList<>(HS);
    }
}