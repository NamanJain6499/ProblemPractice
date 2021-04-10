package InterviewBitPractice.checkpoint;

import java.util.List;
import java.util.Stack;

public class Subtract {
    public static void main(String args[]){
        Subtract sub =new Subtract();
        ListNode one=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode three=new ListNode(3);
        ListNode four=new ListNode(4);
        ListNode five=new ListNode(5);
        ListNode six=new ListNode(6);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        //created linklist 1->2->3->4->5->null
        ListNode answer=sub.subtract(one);
        System.out.println(answer.val);
    }

    private ListNode subtract(ListNode head) {
        //if length of linklist is 0/1 return same linklist
        if(head==null || head.next==null)
            return head;
        ListNode slow=head;
        ListNode fast=head;
        while (slow!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Stack<Integer> st=new Stack<>();
        ListNode middle=slow.next;
        while (middle!=null){
            st.push(middle.val);
            middle=middle.next;
        }
        ListNode curr=head;
        while (!st.isEmpty()){
            curr.val=st.pop()-curr.val;
            curr=curr.next;
        }
        return head;
        }


    static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
