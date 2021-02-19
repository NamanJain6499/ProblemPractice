package InterviewBitPractice.BinarySearch;

import java.util.ArrayList;

//solution from
//https://www.youtube.com/watch?v=g0JnHXvgucw
public class AllocateBooks {
    public static void main(String args[]){
        ArrayList<Integer> A=new ArrayList<>();
        A.add(31);
        A.add(14);
        A.add(19);
        A.add(75);
        int B=12;
        AllocateBooks allocateBooks=new AllocateBooks();
        int answer=allocateBooks.books(A,B);
        System.out.println(answer);
    }

    private int books(ArrayList<Integer> A, int B) {
        int n=A.size();
        int lb=0;
        int s=0;
        int ans=0;
        for (int i=0;i<n;i++){
            s+=A.get(i);
        }
        int ub=s;
        //if number of student are greater than number of books then after giving n books also b-n student will be left without book
        if (B>n){
            return -1;
        }
        while (lb<=ub){
            int mid=(lb+ub)/2;
            //mid represent number of pages
            if (solve(A,n,mid,B)){//here we send array,size,mid,no.of student in which we want to divide book
                ans=mid;//if solve is true that means we can divide mid no. pages in B student then check for less number// of pages hence upper bound=mid-1
                ub=mid-1;
            }else {
                lb=mid+1;
            }
        }
        return ans;
    }

    private boolean solve(ArrayList<Integer> A, int n, int mid, int B) {
        int sum=0;
        int stu=1;//one student need to be assign in starting
        for (int i=0;i<n;i++){
            if (A.get(i)>mid) return false;
            if (sum+A.get(i)>mid){
                stu++;
                sum=A.get(i);
                if (stu>B) return false;
            }
            else sum  +=A.get(i);
        }
        return true;
    }
}