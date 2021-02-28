package InterviewBitPractice.LinkList;

//solution
//https://www.youtube.com/watch?v=aM4Iv7eEr2o
public class AddTwoNumbersAsLists {
    public static void main(String args[]){
        AddTwoNumbersAsLists add=new AddTwoNumbersAsLists();
        ListNode one=new ListNode(2);
        ListNode two=new ListNode(4);
        ListNode three=new ListNode(3);
        one.next=two;
        two.next=three;

        ListNode four=new ListNode(5);
        ListNode five=new ListNode(6);
        ListNode six=new  ListNode(4);
        four.next=five;
        five.next=six;

        ListNode answer=add.deleteDuplicates(one,four);
        System.out.println(answer.val);
    }

    private ListNode deleteDuplicates(ListNode l1, ListNode l2) {
        ListNode dummy_head=new ListNode(0);
        ListNode l3=dummy_head;

        int carry=0;
        while (l1!=null || l2!=null){
            int l1_val=(l1!=null) ? l1.val : 0;
            int l2_val=(l2!=null) ? l2.val : 0;


            int current_sum=l1_val+l2_val+carry;
            carry=current_sum/10;
            int last_digit=current_sum%10;
            ListNode new_node=new ListNode(last_digit);
            l3.next=new_node;

            if(l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;

            l3=l3.next;
        }
        if (carry>0){
            ListNode new_node=new ListNode(carry);
            l3.next=new_node;
            l3=l3.next;
        }
        return dummy_head.next;
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


