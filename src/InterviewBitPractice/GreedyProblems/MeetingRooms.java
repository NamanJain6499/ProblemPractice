package InterviewBitPractice.GreedyProblems;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MeetingRooms {
    private Object meetingtime;

    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        int N=6;
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<N;i++){
            arr.add(new ArrayList<>());
            arr.get(i).add(0,scanner.nextInt());
            arr.get(i).add(1,scanner.nextInt());
        }
        MeetingRooms meetingRooms=new MeetingRooms();
        int answer=meetingRooms.solve(arr);
        System.out.println(answer);
    }

    private int solve(ArrayList<ArrayList<Integer>> arr) {
        ArrayList<MeetingTime> meetingTime=new ArrayList<MeetingTime>();
        for (int i=0;i<arr.size();i++){
            meetingTime.add(new MeetingTime(arr.get(i).get(0),arr.get(i).get(1)));
        }
        Collections.sort(meetingTime, new Comparator<MeetingTime>() {
            @Override
            public int compare(MeetingTime o1, MeetingTime o2) {
                if(o1.end> o2.end){
                    return 1;
                }
                else if (o1.end<o2.end){
                    return -1;
                }
                else
                    return 0;
            }
        });

        int idx=0;
        int count=0;
        int rooms=1;
        for (int i=1;i<arr.size();i++){
            if (meetingTime.get(i).start>=meetingTime.get(idx).end){
                count++;
            }


        }
        return count;

    }

    public class MeetingTime {
        int start;
        int end;

        public MeetingTime(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}

