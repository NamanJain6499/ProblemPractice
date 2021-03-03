package InterviewBitPractice.LinkList;


import java.util.List;

public class SortList {
    public static void main(String args[]){
        SortList sort= new SortList();
        ListNode one=new ListNode(8);
        ListNode two=new ListNode(5);
        ListNode three=new ListNode(4);
        ListNode four=new ListNode(3);
        one.next=two;
        two.next=three;
        three.next=four;
        ListNode answer=sort.sortList(one);
        System.out.println(answer.val);
    }

    private ListNode sortList(ListNode head) {

        if (head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast= head;

        while (fast!=null && fast.next!=null){
            temp=slow;//tail of first part of list
            slow=slow.next;//head of second part of list
            fast=fast.next.next;//tail for second part
        }
        temp.next=null;//as temp is tail of first list it point to null
        ListNode left_side=sortList(head);
        ListNode right_side=sortList(slow);
        return merge(left_side,right_side);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode sorted_temp=new ListNode(0);
        ListNode current_node=sorted_temp;

        while (l1!=null && l2!=null){
            if (l1.val<l2.val){
                current_node.next=l1;
                l1=l1.next;
            }else {
                current_node.next=l2;
                l2=l2.next;
            }
            current_node=current_node.next;
        }
        if (l1!=null){
            current_node.next=l1;
            l1=l1.next;
        }
        if (l2!=null){
            current_node.next=l2;
            l2=l2.next;
        }
        return sorted_temp.next;
    }
}
