package InterviewBitPractice.LinkList;

public class SortBinaryLinkedList {
    public static void main(String args[]){
        SortBinaryLinkedList sort=new SortBinaryLinkedList();
        ListNode one=new ListNode(1);
        ListNode two=new ListNode(1);
        ListNode three=new ListNode(0);
        ListNode four=new ListNode(0);
        ListNode five=new ListNode(1);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        ListNode answer=sort.solve(one);
        System.out.println(answer.val);

    }

    private ListNode solve(ListNode head) {
       ListNode current=head;
       int n1=0;
       int n2=0;
       while (current!=null){
           if (current.val==0){
               n1+=1;
           }else {
               n2+=1;
           }
           current=current.next;
       }
       current=head;
       while (n1!=0){
           current.val=0;
           current=current.next;
           n1=n1-1;
       }
       while (n2!=0){
           current.val=1;
           current=current.next;
           n2=n2-1;
       }
       return head;

    }
}
