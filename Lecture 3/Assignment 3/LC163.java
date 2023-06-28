/* Assignment 3
   Q7
   Leet code 163 (Premium)*/
import java.util.*;
public class Main
{
    public static HashSet<List<Integer>> findMissingRanges(int[] nums, int lower, int upper)
    {
        HashSet<List<Integer>> Final = new HashSet<>();
        if (nums[0] != lower)
        {
            Final.add(Arrays.asList(lower, nums[0] - 1));
        }
        for (int i  = 0; i < nums.length - 1; i++)
        {
            if (nums[i] + 1 != nums[i + 1])
            {
                Final.add(Arrays.asList(nums[i] + 1, nums[i + 1] - 1));
            }
        }
        if (nums[nums.length - 1] != upper)
        {
            Final.add(Arrays.asList(nums[nums.length - 1] + 1, upper));
        }
        return Final;
    }
    public static void main(String[] args)
    {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0, upper = 99;
        System.out.println(findMissingRanges(nums, lower, upper));
    }
}