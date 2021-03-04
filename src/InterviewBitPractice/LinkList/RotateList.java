package InterviewBitPractice.LinkList;
//solution
//https://www.youtube.com/watch?v=VX5Fz9z4-CE
public class RotateList {
    public static void main(String args[]){
        RotateList rotate=new RotateList();
        ListNode one=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode three=new ListNode(3);
        ListNode four=new ListNode(4);
        ListNode five=new ListNode(5);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        int k=2;
        ListNode answer=rotate.rotateRight(one,k);
        System.out.println(answer.val);
    }

    private ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        int len=1;
        ListNode tail=head;
        while (tail.next!=null){
            ++len;
            tail=tail.next;
        }
        k%=len;//if k>len then rotating k times is equal to rotating k%len times
        if (k==0){
            return head;
        }
        int stepToNewHead=len-k;
        tail.next=head;
        ListNode new_tail=tail;
        while (stepToNewHead-- >0){
            new_tail=new_tail.next;
        }
        ListNode new_head=new_tail.next;
        new_tail.next=null;

        return new_head;
    }
}
