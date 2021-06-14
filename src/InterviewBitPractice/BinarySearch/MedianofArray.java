package InterviewBitPractice.BinarySearch;

import java.util.ArrayList;

public class MedianofArray {
    public static void main(String[] args) {
        MedianofArray m=new MedianofArray();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        a.add(-50);
        a.add(-41);
        a.add(-40);
        a.add(-19);
        a.add(5);
        a.add(21);
        a.add(28);
        b.add(-50);
        b.add(-21);
        b.add(-10);
        double answer=m.findMedianSortedArrays(a,b);
        System.out.println(answer);
    }

    private double findMedianSortedArrays(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i=0;
        int j=0;
        ArrayList<Integer> merged=new ArrayList<>();
        while(i<a.size() && j<b.size()){
            if(a.get(i)<b.get(j)){
                merged.add(a.get(i));
                i++;
            }else{
                merged.add(b.get(j));
                j++;
            }
        }
        while(i<a.size()){
            merged.add(a.get(i));
            i++;

        }
        while(j<b.size()){
            merged.add(b.get(j));
            j++;
        }
        double ans=0.0;
        int mid=merged.size()/2;
        if(merged.size()%2!=0){
            ans=(double) merged.get(mid);
        }else{
            ans=(double)(merged.get(mid)+merged.get(mid-1))/2;
        }

        return ans;

    }
}
