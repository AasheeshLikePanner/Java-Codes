package LeetCode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CourseSchedule3 {
    public static void main(String[] args) {
        System.out.println(scheduleCourse(new int[][]{{100,200},{200,1300},{1000,1250},{2000,3200}}));
        System.out.println(scheduleCourse(new int[][]{{1,2},{2,3}}));
        System.out.println(scheduleCourse(new int[][]{{5,5},{2,6},{4,6}}));
    }
    public static int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
        int prev= 0;
        PriorityQueue<Integer> max = new PriorityQueue<>((d1, d2) -> Integer.compare(d2, d1));
        for (int[] cours : courses) {
            max.add(cours[0]);
            prev += cours[0];
            if (cours[1] < prev) {
                prev -= max.poll();
            }
        }
        return max.size();
    }
}
