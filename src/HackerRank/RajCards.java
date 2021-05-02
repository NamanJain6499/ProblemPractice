package HackerRank;

import java.util.Scanner;
//abcdefghijklmnopqrstuvwxyz
public class RajCards {
    public static void main(String[] args) {
        RajCards raj=new RajCards();
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        String spell;
        for(int i=0;i<t;i++){

            alphabet =scanner.next();
            spell=scanner.next();
            int time=raj.findTime(alphabet,spell,0);
            System.out.println(time);
        }


    }
    private int findTime(String alphabet,String s,int start){
        int time=0;
        int i=start;
        for (int k=0;k<s.length();k++){
            int j=alphabet.indexOf(s.charAt(k));
            time+=Math.abs(i-j);
            i=j;
        }
        return time;
    }
}
