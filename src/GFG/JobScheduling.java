package GFG;

import java.util.Arrays;
import java.util.Comparator;

public class JobScheduling {
    public static void main(String[] args) {
        JobScheduling jobScheduling=new JobScheduling();
        Job [] arr=new Job[4];
        arr[0]=new Job(1,4,20);
        arr[1]=new Job(2,1,10);
        arr[2]=new Job(3,1,40);
        arr[3]=new Job(4,1,30);
        int N=4;
        int [] answer=jobScheduling.JobScheduling(arr,N);
        System.out.println(answer[0]+" "+answer[1]);
    }

    private int[] JobScheduling(Job[] arr, int n) {
        Arrays.sort(arr, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                if(o1.profit<o2.profit){
                    return 1;
                }else if(o1.profit>o2.profit){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
//        Arrays.sort(arr,new Comparator<Job>(){
//
//            public int compareTo(Job o1,Job o2){
//                if(o1.profit<o2.profit){
//                    return 1;
//                }else if(o1.profit>o2.profit){
//                    return -1;
//                }else{
//                    return 0;
//                }
//            }
//        });
        int time=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i].deadline>time){
                max+=arr[i].profit;
                time++;
            }
        }
        int ans[]=new int[2];
        ans[0]=time;
        ans[1]=max;
        return ans;

    }
}
class Job{
    int id;
    int deadline;
    int profit;
    Job(int id,int deadline,int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }
}
