package InterviewBitPractice.LinkList;

public class RemoveNthNodefromListEnd {
    public static void main(String args[]) {
        RemoveNthNodefromListEnd delete = new RemoveNthNodefromListEnd();
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        int B = 15;
        ListNode answer = delete.removeNthFromEnd(one, B);
        System.out.println(answer.val);
    }

    private ListNode removeNthFromEnd(ListNode head, int B) {
        ListNode temp=head;
        int len=0;
        //count the length of linklist
        while (temp!=null){
            len++;
            temp=temp.next;
        }
        //if B is greater than length of list than remove first node of the list.
        if (B>=len){
            head=head.next;
            return head;
        }
        //find position of element to be removed from starting
        int pos=len-B+1;
        if (pos==1){
            return head.next;
        }
        temp=head;
        len=0;
        while (temp!=null){
            len++;
            if(pos-1==len){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
       return head;
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
