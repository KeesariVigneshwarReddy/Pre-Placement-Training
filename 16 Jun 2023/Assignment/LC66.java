/* Assignment Q4
   Leet code 66 */
class Solution 
{
    public int noOfDigits(long n)
    {
        int count = 0;
        while (n > 0)
        {
            count++;
            n /= 10;
        }
        return count;
    }
    public int[] plusOne(int[] digits) 
    {
        long sum = 0;
        long weight = 1;
        for (int i = digits.length - 1; i >= 0; i--)
        {
            sum += digits[i] * weight;
            weight *= 10;
        }
        sum++;
        int arr[] = new int[noOfDigits(sum)];
        for (int i = arr.length - 1; i >= 0; i--)
        {
           arr[i] = (int)(sum % 10);
           sum /= 10;
        } 
        return arr;
    }
}