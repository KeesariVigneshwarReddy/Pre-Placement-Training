/* DSA Mock test Q2
   Leet Code 387 */
class Solution 
{
    public int firstUniqChar(String s) 
    {
        LinkedHashMap<Character, Integer> LHM = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            LHM.put(s.charAt(i), LHM.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Character key : LHM.keySet())
        {
            if (LHM.get(key) == 1)
            {
                return s.indexOf(key);
            }
        }
        return -1;
    }
}