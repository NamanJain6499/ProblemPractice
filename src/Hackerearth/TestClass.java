package Hackerearth;

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        //int t=scanner.nextInt();
        //for(int i=0;i<t;i++){
            int num=96;
            if(check(num)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    //}
    public static boolean check(int num){
        boolean extra_digit=false;
        if(num%3!=0){
            return false;
        }
        while(num>0){
            int last_digit=num%10;
            if(last_digit!=6&&last_digit!=9){
                extra_digit=true;
            }
            num/=10;
        }
        if(extra_digit){
            return false;
        }
        return true;
    }
}
