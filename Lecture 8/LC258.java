/* Leet code 258 */
class Solution 
{
    public static int sum(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }
    public int addDigits(int num) 
    {
        while (true)
        {
            if (num / 10 == 0)
            {
                break;
            }
            num = sum(num);
        }
        return num;
    }
}