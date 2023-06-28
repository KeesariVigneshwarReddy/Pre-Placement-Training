/* Leet code 189 */
class Solution
{
    public void reverse(int[] a, int idx1, int idx2)
    {
        for (int i = idx1, j = idx2; i <= j; i++, j--)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    public void rotate(int[] nums, int k) 
    {
        k %= nums.length;
        reverse(nums, 0, nums.length - k -  1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
}