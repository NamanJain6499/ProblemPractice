package InterviewBitPractice.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//solution
//https://www.youtube.com/watch?v=7uwygP5GKDk
public class RomanToInteger {
    public static void main(String args[]){
        String num="CCVX";
        RomanToInteger integer=new RomanToInteger();
        int answer=integer.romantointeger(num);
        System.out.println(answer);
    }

    private int romantointeger(String num) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result=0;
        if (num==null || num.length()==0){
            return 0;
        }
        for (int i=0;i<num.length()-1;i++){
            if (map.get(num.charAt(i))>=map.get(num.charAt(i+1))){
                result =result+map.get(num.charAt(i));
            }else
                result=result-map.get(num.charAt(i));
        }
        result=result+map.get(num.charAt(num.length()-1));
        return result;
    }
}
