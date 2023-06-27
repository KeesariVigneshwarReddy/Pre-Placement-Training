/* Leet code 70 */
class Solution 
{
    public int fib(int[] CS, int n) 
    {
        if (n == 1 || n == 2)
        {
            return n;
        }
        if (CS[n] != 0)
        {
            return CS[n];
        }
        else
        {
            CS[n] = fib(CS, n - 1) + fib(CS, n - 2);
        }
        return CS[n];
    }
    public int climbStairs(int n) 
    {
        int[] CS =  new int[n + 1];
        return fib(CS, n);
    }
}