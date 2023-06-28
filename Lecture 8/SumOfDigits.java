/* Sum of digits using recursion */
import java.util.*;
public class Main
{
    public static int sum(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }
    public static void main(String args[])
    {
        int n = 1234;
        System.out.println(sum(n));
    }
}