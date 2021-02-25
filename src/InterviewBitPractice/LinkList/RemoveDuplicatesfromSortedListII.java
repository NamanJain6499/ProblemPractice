package InterviewBitPractice.LinkList;
//solution
//https://www.youtube.com/watch?v=R6-PnHODewY
public class RemoveDuplicatesfromSortedListII {
    public static void main(String args[]){
        RemoveDuplicatesfromSortedListII remove=new RemoveDuplicatesfromSortedListII();
        //1->2->3->3->4->4->5
        ListNode one=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode three=new ListNode(3);
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
        ListNode answer= RemoveDuplicatesfromSortedListII.deleteDuplicates(one);
        System.out.println(answer.val);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode previous=dummy;

        while (head!=null ){
            if (head.next!=null && head.val== head.next.val){
                //skip nodes whose value equal to head
                while (head.next!=null && head.val== head.next.val){
                    head=head.next;
                }
                previous.next=head.next;
            }else
                previous=previous.next;
            head=head.next;
        }
        return dummy.next;
    }

   public static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }


}
