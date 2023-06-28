/* Assignment 3
   Q8
   Leet code 252 (Premium)*/
import java.lang.reflect.Array;
import java.util.*;
public class Main
{
    static class Interval
    {
        int s;
        int e;
        public Interval (int s, int e) {
            this.s = s;
            this.e = e;
        }
    }
    public static boolean canAttendMeetings(Interval[] intervals)
    {
        Arrays.sort(intervals, new Comparator<Interval>(){
                                                             public int compare(Interval a, Interval b)
                                                             {
                                                                return a.s-b.s;
                                                             }
                                                         }
                   );
        for (int i = 0; i < intervals.length - 1; i++)
        {
            if(intervals[i]. e > intervals[i + 1].s)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Interval[] intervals = new Interval[3];
        intervals[0] = new Interval(0, 30);
        intervals[1] = new Interval(5, 10);
        intervals[2] = new Interval(15, 20);
        System.out.println(canAttendMeetings(intervals));
    }
}