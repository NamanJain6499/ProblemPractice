package InterviewBitPractice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class HotelBookingPossibles {
    public static void  main(String args[]){
        ArrayList<Integer> arrive=new ArrayList<>();
        ArrayList<Integer> depart=new ArrayList<>();
        arrive.add(1);
        arrive.add(3);
        arrive.add(5);
        depart.add(2);
        depart.add(6);
        depart.add(8);
        int k=1;
        HotelBookingPossibles bookingPossibles=new HotelBookingPossibles();
        boolean answer=HotelBookingPossibles.hotel(arrive,depart,k);
        System.out.println(answer);

    }

    private static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int k) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int i=1;
        int j=0;
        int curr=1;
        boolean rv=true;//rv represent return value
        //there are 3 cases next value ofarrive array list can be less than depart or equal or greater than all three are shown here.
        while (i<arrive.size()&&j<arrive.size()){
            if(arrive.get(i)<depart.get(j)) {
                curr++;
                if (curr > k) {
                    rv = false;
                    break;
                }
                i++;
            } else if (arrive.get(i)==depart.get(j)){
                    //now previous booking left so rooms are available for next booking so increase i and j
                    i++;
                    j++;
                } else {
                    curr--;
                    if(curr<0)
                        curr=0;
                        j++;

                }
            }

        return rv;
    }
}
