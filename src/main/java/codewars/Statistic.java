package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Statistic {

    public static void main(String[] args) {

//        You are the "computer expert" of a local Athletic Association (C.A.A.). Many
//        teams of runners come to compete. Each time you get a string of all race results of
//        every team who has run. For example here is a string showing the individual results of a team of 5 runners:
//        "01|15|59, 1|47|6, 01|17|20, 1|32|34, 2|3|17"
//        Each part of the string is of the form: h|m|s where h, m, s
//        (h for hour, m for minutes, s for seconds) are positive or null integer
//        (represented as strings) with one or two digits. There are no traps in this format.
//                To compare the results of the teams you are asked for giving three
//                statistics; range, average and median.
//        Range : difference between the lowest and highest values. In {4, 6, 9, 3, 7} the lowest value is 3,
//        and the highest is 9, so the range is 9 − 3 = 6.
//        Mean or Average : To calculate mean, add together all of the numbers in a set and then divide the sum
//        by the total count of numbers.
//                Median : In statistics, the median is the number separating the higher half of a data sample
//                from the lower half. The median of a finite list of numbers can be found by arranging all the
//                observations from lowest value to highest value and picking
//                the middle one (e.g., the median of {3, 3, 5, 9, 11} is 5) when
//                there is an odd number of observations. If there is an even number of observations,
//                then there is no single middle value; the median is then defined to be the mean of the two
//                middle values (the median of {3, 5, 6, 9} is (5 + 6) / 2 = 5.5).
//        Your task is to return a string giving these 3 values. For the example given above, the string result
//        will be
//
//
//        "Range: 00|47|18 Average: 01|35|15 Median: 01|32|34"
//        of the form:
//
//        "Range: hh|mm|ss Average: hh|mm|ss Median: hh|mm|ss"
//        where hh, mm, ss are integers (represented by strings) with each 2 digits.
//                Remarks:
//        if a result in seconds is ab.xy... it will be given truncated as ab.
//        if the given string is "" you will return ""


    }

    public static String stat(String strg) {
        List<Integer> stats = new ArrayList<Integer>();
        int Mean = 0;
        for (String time : strg.split(",")) {
            time = time.trim();
            int t = Integer.parseInt(time.substring(0, time.indexOf('|'))) * 60 * 60 +
                    Integer.parseInt(time.substring(time.indexOf('|') + 1, time.lastIndexOf('|'))) * 60 +
                    Integer.parseInt(time.substring(time.lastIndexOf('|') + 1));
            Mean += t;
            stats.add(t);
        }
        Collections.sort(stats);
        int Range = Collections.max(stats) - Collections.min(stats);
        Mean /= stats.size();
        int Median = stats.size() % 2 == 0 ? (stats.get((stats.size() / 2) - 1) + stats.get(stats.size() / 2)) / 2 : stats.get((stats.size() / 2));

        return String.format("Range: %02d|%02d|%02d Average: %02d|%02d|%02d Median: %02d|%02d|%02d",
                Range / 3600, (Range % 3600) / 60, Range % 60, Mean / 3600, (Mean % 3600) / 60, Mean % 60, Median / 3600, (Median % 3600) / 60, Median % 60);
    }

}
