/* Assignment 2 Q2
   Leet Code 575 */
class Solution 
{
    public int countDistinct(int a[])
    {
        Arrays.sort(a);
        int count = 1;
        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] != a[i + 1])
            {
                count++;
            }
        }
        return count;
    }
    public int distributeCandies(int[] candyType) 
    {
        if (countDistinct(candyType) >= candyType.length / 2)
        {
            return candyType.length / 2;
        }
        return countDistinct(candyType);
    }
}