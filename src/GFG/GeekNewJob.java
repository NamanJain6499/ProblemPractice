package GFG;

import java.util.Scanner;

public class GeekNewJob {
    public static void main(String[] args) {
        //code
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[]S=new String[T];
        for (int i = 0; i < T; i++) {
            S[i]=scanner.next();
            }
        for(int i=0;i<T;i++){
            if(valid(S[i])){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        }

    public static boolean valid(String S){
        int n=S.length();
        int numeric=0;
        int lower=0;
        int upper=0;
        for(int i=0;i<n;i++){
            char ch=S.charAt(i);
            if(ch>=48 && ch<=57 ){
                numeric+=1;
            }else if(ch>=97 && ch<=112){
                lower+=1;
            }else if(ch>=65 && ch<=90){
                upper+=1;
            }

        }
        if(numeric>=1  && lower>=1 && upper>=1){
            return true;
        }

        return false;
    }
}
