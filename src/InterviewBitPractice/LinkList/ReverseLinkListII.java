package InterviewBitPractice.LinkList;
//complete solution
//https://www.youtube.com/watch?v=GSJuwQzKSnI&t=190s
public class ReverseLinkListII {
    public static void main(String args[]){
        ReverseLinkListII reverseLinkListII=new ReverseLinkListII();
        ListNode one =new ListNode(1);
        ListNode two =new ListNode(2);
        ListNode three =new ListNode(3);
        ListNode four =new ListNode(4);
        ListNode five =new ListNode(5);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        int B=2;
        int C=4;
        ListNode answer=reverseLinkListII.reverseBetween(one,B,C);
        System.out.println(answer.val);
    }

    private ListNode reverseBetween(ListNode head, int m, int n) {
        if (head==null){
            return null;
        }

        ListNode prev=null;
        ListNode current_node=head;
        while(m>1){
           prev=current_node;
           current_node=current_node.next;
           n--;
           m--;
        }
        ListNode connection=prev;
        ListNode tail=current_node;//after reverse tail become end of list

        //solution for reversing linklist
        //https://www.youtube.com/watch?v=jY-EUKXYT20
        while (n>0){
            ListNode next_node=current_node.next;
            current_node.next=prev;
            prev=current_node;
            current_node=next_node;
            n--;
        }
        if (connection!=null){
            connection.next=prev;
        }else {
            head=prev;
        }
        tail.next=current_node;


        return head;


    }
}
