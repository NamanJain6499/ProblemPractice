
package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverlappingIntervalsConcept {

    public static void main(String[] args) {
        String A;
        ArrayList<Interval> list = new ArrayList<>();

        list.add(new Interval(1, 3));
        list.add(new Interval(15, 18));
        list.add(new Interval(2, 6));
        list.add(new Interval(8, 10));

        MergeOverlappingIntervalsConcept overlappingIntervals = new MergeOverlappingIntervalsConcept();
        ArrayList<Interval> merge = overlappingIntervals.merge(list);
    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        if (intervals == null) return null;

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start < o2.start)
                    return -1;
                if (o1.start > o2.start)
                    return 1;
                return 0;

            }
        });

        System.out.println(intervals);


        ArrayList<Interval> merged = new ArrayList<>();

        for (Interval current : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1).end < current.start) {
                merged.add(current);
            } else {
                merged.get(merged.size() - 1).end = Math.max(current.end,
                        merged.get(merged.size() - 1).end);
            }
        }
        return merged;
    }


    public static class Interval {
        int start;
        int end;


        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}



