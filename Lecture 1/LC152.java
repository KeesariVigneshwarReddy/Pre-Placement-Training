/* Leet code 152 */
class Solution
{
    public int maxProduct(int[] nums) 
    {
        int MP = nums[0];
        for (int i = 0; i < nums.length; i++)
        {
            int CP = 1;
            for (int j = i; j < nums.length; j++)
            {
                CP *= nums[j];
                MP = Math.max(MP, CP);
            }
        }
        return MP;
    }
}