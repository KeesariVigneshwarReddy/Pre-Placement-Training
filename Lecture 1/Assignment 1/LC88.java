/* Assignment 1 Q5
   Leet Code 88 */
class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        PriorityQueue<Integer> PQ = new PriorityQueue<>();
        for (int i = 0; i < m; i++)
        {
            PQ.add(nums1[i]);
        }
        for (int i = 0; i < n; i++)
        {
            PQ.add(nums2[i]);
        }
        int j = 0;
        while (!PQ.isEmpty())
        {
            nums1[j++] = PQ.remove();
        }
    }
}