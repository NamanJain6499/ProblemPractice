package InterviewBitPractice.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    public static void main(String args[]){
        int num=206;
        IntegerToRoman roman=new IntegerToRoman();
        String answer=roman.integertoroman(num);
        System.out.println(answer);

    }

    private String integertoroman(int num) {
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("M",1000);
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40);
        map.put("X",10);
        map.put("IX",9);
        map.put("V",5);
        map.put("IV",4);
        map.put("I",1);

        StringBuilder sb=new StringBuilder();

        for (Map.Entry<String ,Integer> entry:map.entrySet()){
            while (num>=entry.getValue()){
                num=num-entry.getValue();
                sb.append(entry.getKey());
            }

        }
        return sb.toString();
    }
}
