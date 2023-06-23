/* 2) Max and Min in array */
import java.util.*;
public class Main
{
    public static int min(int a[])
    {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++)
        {
            mini = Math.min(mini, a[i]);
        }
        return mini;
    }
    public static int max(int a[])
    {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++)
        {
            maxi = Math.max(maxi, a[i]);
        }
        return maxi;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println(min(a));
        System.out.println(max(a));
    }
}