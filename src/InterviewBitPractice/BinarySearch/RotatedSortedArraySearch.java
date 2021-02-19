package InterviewBitPractice.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotatedSortedArraySearch {
    public static void main(String args[]){
        RotatedSortedArraySearch  sortedArraySearch=new RotatedSortedArraySearch();
        List<Integer> A=new ArrayList<>();
        A.add(4);
        A.add(5);
        A.add(6);
        A.add(7);
        A.add(0);
        A.add(1);
        A.add(2);
        A.add(3);
        int B=3;
        int answer=sortedArraySearch.search(A,B);
        System.out.println(answer);
        }

    private int search(List<Integer> A, int B) {
        int n=A.size();
        int start=0 ;
        int end=n-1;
        Integer max=Collections.max(A);
        int maxIndex=A.indexOf(Collections.max(A));
        if (B>max){
            return -1;
        }
        else if (B==max){
            return maxIndex;
        }
        else {
            int searchleft=BinarySearch(A,start,maxIndex,B);
            int searchRight=BinarySearch(A,maxIndex+1,end,B);
            if (searchleft!=-1){
                return searchleft;
            }
            else if (searchRight!=-1){
                return searchRight;
            }
        }
        return -1;
    }

    private int BinarySearch(List<Integer> A, int start, int end, int B) {
        while (start<=end){
            int mid=(start+end)/2;
            if (A.get(mid)==B){
                return mid;
            }
            else if (A.get(mid)>B){
                end=mid-1;
            }else
                start=mid+1;
        }
        return -1;
    }

}

