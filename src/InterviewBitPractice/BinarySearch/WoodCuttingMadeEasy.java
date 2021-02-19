package InterviewBitPractice.BinarySearch;

import java.util.ArrayList;

//approach from
//https://www.youtube.com/watch?v=4oxPZIfk88k
public class WoodCuttingMadeEasy {
    public static void main(String args[]){
        WoodCuttingMadeEasy easy=new WoodCuttingMadeEasy();
        ArrayList<Integer> A=new ArrayList<>();
        A.add(4);
        A.add(42);
        A.add(40);
        A.add(26);
        A.add(46);
        int B=20;
        int height=easy.solve(A,B);
        System.out.println(height);
    }
//range in which binary search will be applied is fron start=0 to maximum height in arraylist end=max(A)
// here "x"  is the length of wood after cuttingif we cut from mid
//if the length of wood "x"  is egual to required i.e B return mid or if start = mid then also return mid.
//if length of wood i.e "x" is greater than B required than we need to move wood cutter blade above so start =mid
//else if the length of wood is less than B we need to move blade below mid so end =mid
    public int solve(ArrayList<Integer> A, int B) {
        long n=A.size();
        long start=0;
        long end=Integer.MIN_VALUE;
        long mid = 0;
        for (int i=0;i<n;i++){
            end=Math.max(A.get(i),end);
        }
        while (start<=end){
            mid=(start+end)/2;
            long x=fun(A,mid);
            if (x==B || start==mid){
                return (int) mid;
            }else if (x>B){
                start=mid;
            }
            else
                end =mid;

        }
        return (int) mid;
    }
//fun return length of wood above mid after cutting
    private long fun(ArrayList<Integer> A, long mid) {
        long sum=0;
        for (int i=0;i<A.size();i++){
            if (A.get(i)>mid){
                sum+=(A.get(i)-mid);
            }
        }
        return sum;
    }
}
