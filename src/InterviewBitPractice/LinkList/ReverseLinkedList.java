package InterviewBitPractice.LinkList;

public class ReverseLinkedList {
    public static void main(String args[]) {
        ReverseLinkedList reverse = new ReverseLinkedList();
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        ListNode answer = reverse.reverseList(one);
        System.out.println(answer.val);
    }

    //solution
    //https://www.youtube.com/watch?v=jY-EUKXYT20
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode previous = null;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = previous;//for first time previous is null
            previous = curr;
            curr = next;
        }
        return previous;
    }
}
