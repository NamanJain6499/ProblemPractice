package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverlappingInterval {
    public static void main(String args[]){
        ArrayList<Interval> list = new ArrayList<>();

        list.add(new Interval(1, 3));
        list.add(new Interval(5, 10));
        list.add(new Interval(15, 18));
        list.add(new Interval(2, 6));
        list.add(new Interval(8, 10));
        MergeOverlappingInterval overlappingInterval=new MergeOverlappingInterval();
        ArrayList<Interval> afterMerged=overlappingInterval.merge(list);
        System.out.println(afterMerged);
    }

    private ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if(intervals.size()==1 || intervals.size()==0)
            return intervals;
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
        Interval newInterval = new Interval();
        int i=0;
        while(i<intervals.size()-1)
        {
            if(intervals.get(i).end >= intervals.get(i+1).start)
            {
                newInterval.start = Math.min(intervals.get(i).start,intervals.get(i+1).start);
                newInterval.end = Math.max(intervals.get(i).end,intervals.get(i+1).end);
                //here we are removing teo intervals as after first remove statement
                // next interval become first or 0 index interval so again we need to remove that
                intervals.remove(i);
                intervals.remove(i);
                intervals.add(i,newInterval);
                //we are checking i>0 as when we merge two interval into one then the size of interval class also reduces by one
                // and hence this check is done
                if(i>0)
                    i--;
            }
            else
                i++;
        }
        return intervals;
    }


    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

}

