package InterviewBitPractice.LinkList;

public class KthNodeFromMiddle {
    public static void main(String args[]){
        KthNodeFromMiddle middle=new KthNodeFromMiddle();
        ListNode one=new ListNode(871);
        //ListNode two=new ListNode(14);
        //ListNode three=new ListNode(6);
        //ListNode four=new ListNode(16);
        //ListNode five=new ListNode(4);
        //ListNode six=new ListNode(10);
        //ListNode seven=new ListNode(15);
        //ListNode eight=new ListNode(61);
        //ListNode nine=new ListNode(16);
        //one.next=two;
        //two.next=three;
        //three.next=four;
        //four.next=five;
        //five.next=six;
        //six.next=seven;
        //seven.next=eight;
        //eight.next=nine;
        int B=1;
        int answer=middle.solve(one,B);
        System.out.println(answer);
    }

    private int solve(ListNode head, int B) {
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast= head;

        while (fast!=null && fast.next!=null){
            temp=slow;//tail of first part of list
            slow=slow.next;//head of second part of list
            fast=fast.next.next;//tail for second part
        }
        int lenght_before_middle=1;
        ListNode current=head;
        while (current!=temp){
            lenght_before_middle++;
            current=current.next;
        }
        current=head;
        int position=lenght_before_middle-B;

        if (current.next==null){
            return -1;
        }
        if (position<0){
            return -1;
        }else {
            while (position-- >0){
                current=current.next;
            }
        }

        return current.val;
    }
}
