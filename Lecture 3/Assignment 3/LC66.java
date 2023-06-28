/* Assignment 3
   Q5
   Leet code 66 */
class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        digits[digits.length - 1]++;
        int i = digits.length - 1;
        while(i > 0 && digits[i] == 10)
        {
            digits[i] = 0;
            digits[i - 1]++;
            i--;
        }
        if (digits[0] == 10)
        {
            int[] a = new int[digits.length + 1];
            a[0] = 1;
            a[1] = 0;
            for (int j = 1; j < digits.length; j++)
            {
                a[j + 1] = digits[j];
            }
            return a;
        }
        return digits;
    }
}