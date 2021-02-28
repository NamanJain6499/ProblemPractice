package InterviewBitPractice.LinkList;

public class ListCycle {
    public static void main(String args[]){
        ListCycle add=new ListCycle();
        ListNode one=new ListNode(2);
        ListNode two=new ListNode(4);
        ListNode three=new ListNode(3);
        one.next=two;
        two.next=three;
        three.next=two;
        ListNode answer=add.detectCycle(one);
        System.out.println(answer.val);

    }

    private ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null&&fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode temp1=slow;
                ListNode temp2=head;
                while(temp1!=temp2){
                    temp1=temp1.next;
                    temp2=temp2.next;
                }

                return temp1;
            }
        }
        return null;
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
