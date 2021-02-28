package InterviewBitPractice.LinkList;

public class MergeTwoSortedList {
    public static void main(String args[]){
        MergeTwoSortedList merge=new MergeTwoSortedList();
        ListNode one=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode three=new ListNode(4);
        one.next=two;
        two.next=three;

        ListNode four=new ListNode(3);
        ListNode five=new ListNode(2);
        ListNode six=new ListNode(4);
        four.next=five;
        five.next=six;

        ListNode answer=merge.deleteDuplicates(one,four);
        System.out.println(answer.val);
    }

    ListNode deleteDuplicates(ListNode one, ListNode four) {
        ListNode dummy=new ListNode(0);
        ListNode head=dummy;
        while (one!=null &&four!=null){
            if (one.val<four.val){
                dummy.next=one;
                one=one.next;
            }else {
                dummy.next=four;
                four=four.next;
            }
            dummy=dummy.next;
        }
        if (one!=null){
            dummy.next=one;
        }else {
            dummy.next=four;
        }
        return head.next;
    }
    }


    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
}
