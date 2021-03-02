package InterviewBitPractice.LinkList;

public class InsertionSortList {
    public static void main(String args[]){
        InsertionSortList insertionSortList=new InsertionSortList();
        ListNode A=new ListNode(1);
        ListNode B=new ListNode(4);
        ListNode C=new ListNode(3);
        ListNode D=new ListNode(2);
        ListNode E=new ListNode(5);
        ListNode F=new ListNode(2);
        A.next=B;
        B.next=C;
        C.next=D;
        D.next=E;
        E.next=F;
        ListNode answer=insertionSortList.sort(A);
        System.out.println(answer.val);

    }

    private ListNode sort(ListNode A) {
        if(A==null||A.next==null) return A;
        ListNode insert,current=A.next;
        while(current!=null){
            insert=A;
            while(insert!=current){
                if(insert.val<current.val) insert=insert.next;
                else{
                    //change just values and address remain the same.
                    int temp=current.val;
                    current.val=insert.val;
                    insert.val=temp;
                }
            }
            current=current.next;
        }
        return A;
    }
}

