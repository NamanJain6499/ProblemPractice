package InterviewBitPractice.LinkList;

//solution
//https://www.youtube.com/watch?v=K5AVJVjdmL0

//explanation
//https://leetcode.com/problems/partition-list/solution/
public class PartitionList {
    public static void main(String args[]) {
        PartitionList partitionList = new PartitionList();
        ListNode one=new ListNode(1);
        ListNode two= new ListNode(4);
        ListNode three=new ListNode(3);
        ListNode four=new ListNode(2);
        ListNode five=new ListNode(5);
        ListNode six=new ListNode(2);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        int B=3;
        ListNode answer=partitionList.partition(one,B);
        System.out.println(answer.val);
    }

    private ListNode partition(ListNode one, int B) {
        ListNode before_head=new ListNode(0);
        ListNode before=before_head;
        ListNode after_head=new ListNode(0);
        ListNode after=after_head;
        while (one!=null){
            if (one.val<B){
                before.next=one;
                before=before.next;
            }else {
                after.next=one;
                after=after.next;
            }
            one=one.next;
        }
        after.next=null;
        before.next=after_head.next;

        return before_head.next;

    }
}


