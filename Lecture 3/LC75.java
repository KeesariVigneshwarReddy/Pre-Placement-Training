/* Leet code 75 */
class Solution 
{
    public void sortColors(int[] nums) 
    {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < nums.length; i++)
        {
            switch(nums[i])
            {
                case 0 :  count0++;
                break;
                case 1 :  count1++;
                break;
                case 2 :  count2++;
                break;
            }
        }
        int idx1 = -1;
        for (int i = 0; i < nums.length; i++, count0--)
        {
            if (count0 == 0)
            {
                idx1 = i;
                break;
            }
            nums[i] = 0;
        }
        int idx2 = -1;
        for (int i = idx1; i < nums.length; i++, count1--)
        {
            if (count1 == 0)
            {
                idx2 = i;
                break;
            }
            nums[i] = 1;
        }
        for (int i = idx2; i < nums.length; i++, count2--)
        {
            if (count2 == 0)
            {
                break;
            }
            nums[i] = 2;
        }
    }
}