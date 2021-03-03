package InterviewBitPractice.LinkList;

import java.util.ListIterator;

public class ReorderList {
    public static void main(String args[]){
        ReorderList reorder=new ReorderList();
        ListNode one=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode three=new ListNode(3);
        ListNode four=new ListNode(4);
        one.next=two;
        two.next=three;
        three.next=four;
        ListNode answer=reorder.reorderList(one);
        System.out.println(answer.val);
    }

    private ListNode reorderList(ListNode head) {
        if (head==null ||head.next==null){
            return head;
        }

        //head of first half
        ListNode l1=head;
        //head of second half
        ListNode slow=head;
        //tail of second half
        ListNode fast=head;
        //tail of first half
        ListNode prev=null;

        while (fast!=null && fast.next!=null){
            prev=slow;//we use prev as tail for first half of list
            slow=slow.next;//we use slow as head of second half list
            fast=fast.next.next;//fast is tail of second half of list
        }
        prev.next=null;
        ListNode l2=reverse(slow);
        merge(l1,l2);
        return head;
    }

    public void merge(ListNode l1, ListNode l2) {
        while (l1!=null){
            ListNode l1_next=l1.next;
            ListNode l2_next=l2.next;

            l1.next=l2;
            if (l1_next==null){
                break;
            }
            l2.next=l1_next;
            l1=l1_next;
            l2=l2_next;

        }
    }

    public ListNode reverse(ListNode head) {
        ListNode current=head;
        ListNode prev=null;
        while (current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;//after reversing prev node is head reference.
    }
}
