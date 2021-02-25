package InterviewBitPractice.LinkList;

public class RemoveDuplicatesfromSortedList {
    public static void main(String args[]){
        RemoveDuplicatesfromSortedList list=new RemoveDuplicatesfromSortedList();
        ListNode one=new ListNode(1);
        ListNode two=new ListNode(1);
        ListNode three=new ListNode(1);
        ListNode four =new ListNode(3);
        ListNode five=new ListNode(4);
        ListNode six=new ListNode(4);
        ListNode seven=new ListNode(5);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;
        ListNode answer=list.deleteDuplicates(one);
        System.out.println(answer.val);
    }

    private ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while (temp!=null &&temp.next!=null){
            if (temp.val== temp.next.val){
                temp.next=temp.next.next;
            }
            else {x`
                temp=temp.next;
            }
        }
        return head;
    }


    public static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

}
