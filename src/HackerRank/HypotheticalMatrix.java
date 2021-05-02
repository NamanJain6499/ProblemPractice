package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HypotheticalMatrix {
    public static void main(String[] args) {
        HypotheticalMatrix hypo = new HypotheticalMatrix();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int j;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=1;i<=n;i++){
            j=1;
            while (j<n+1){
                ans.add(i*j);
                j++;
            }


        }
        Collections.sort(ans);
        System.out.println(ans.get(k-1));
    }



}
