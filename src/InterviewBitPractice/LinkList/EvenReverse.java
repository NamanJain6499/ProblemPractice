package InterviewBitPractice.LinkList;

import java.util.Stack;

public class EvenReverse {
    public static void main(String args[]){
        EvenReverse reverse=new EvenReverse();
        ListNode one=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode three=new ListNode(3);
        ListNode four=new ListNode(4);
        ListNode five=new ListNode(5);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        ListNode answer=reverse.solve(one);
        System.out.println(answer.next.val);
    }

    private ListNode solve(ListNode A) {
        Stack<Integer> st = new Stack<Integer>();
        ListNode temp1 = A;
        ListNode temp2 = A;

        int n1 = 1;
        while (temp1 != null) {
            if (n1%2 == 0) {
                st.push(temp1.val);
            }
            n1++;
            temp1 = temp1.next;
        }

        int n2 = 1;
        while (temp2 != null) {
            if (n2%2 == 0) {
                temp2.val = st.pop();
            }
            n2++;
            temp2 = temp2.next;
        }

        return A;
    }
}
