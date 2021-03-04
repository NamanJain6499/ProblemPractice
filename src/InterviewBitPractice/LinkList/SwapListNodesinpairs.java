package InterviewBitPractice.LinkList;
//solution
//https://www.youtube.com/watch?v=WYlMkut4XDw
public class SwapListNodesinpairs {
    public static void main(String args[]){
        SwapListNodesinpairs listNodesinpairs=new SwapListNodesinpairs();
        ListNode one=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode three=new ListNode(3);
        ListNode four=new ListNode(4);
        ListNode five=new ListNode(5);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        ListNode answer=listNodesinpairs.swapPairs(one);
        System.out.println(answer.val);
    }

    private ListNode swapPairs(ListNode head) {
        ListNode dummy_node=new ListNode(0);
        ListNode prev=dummy_node;
        ListNode current=head;
        prev.next=head;
        while (current!=null && current.next!=null){
            prev.next=current.next;
            current.next=current.next.next;
            prev.next.next=current;
            current=current.next;
            prev=prev.next.next;
        }
        return dummy_node.next;
    }
}
