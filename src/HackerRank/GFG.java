package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;
/*2
  3 4
  10 20 30
  10 20 10 5
  4 4
  10 2 5 4
  11 3 5 4*/
public class GFG {
    public static void main (String[] args) {
        //code
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        ArrayList<String> str=new ArrayList<>();
        for(int i=0;i<t;i++){
            int sumA=0,sumB=0;
            int size1=scanner.nextInt();
            int size2=scanner.nextInt();
            int a[] = new int[size1];

            for(int j = 0; j < size1; j++)
            {
                a[j] = Integer.parseInt(scanner.next());
                sumA = sumA+ a[j];
            }
            int b[] = new int[size2];
            for(int k=0;k<size2;k++){
                b[k] = Integer.parseInt(scanner.next());
                sumB = sumB+ b[k];
            }
            if(sumA>sumB){
                str.add("C1");
            }else{
                str.add("C2");
            }
        }
        for (int i=0;i<str.size();i++){
            System.out.println(str.get(i));
        }
    }
}
