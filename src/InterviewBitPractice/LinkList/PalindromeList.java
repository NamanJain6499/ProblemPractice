package InterviewBitPractice.LinkList;

import java.util.Stack;

public class PalindromeList {
    public static void main(String args[]){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(3);
        ListNode six = new ListNode(2);
        ListNode seven = new ListNode(1);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;
        PalindromeList palindrome=new PalindromeList();
        int answer=palindrome.lPalin(one);
        System.out.println(answer);
    }

    private int lPalin(ListNode one) {
        ListNode temp=one;
        Stack<Integer> st=new Stack<>();
        while (temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=one;
        while (temp!=null){
            if (temp.val!=st.pop()){
                return 0;
            }else
                temp=temp.next;
        }
        return 1;
    }

    static class ListNode {
          public int val;
          public ListNode next;
          ListNode(int x) { val = x; next = null; }
      }



}

