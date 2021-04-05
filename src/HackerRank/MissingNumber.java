package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MissingNumber {
    public static void main(String[] args)  {
        int arr[]={7,2,5,3,5,3};
        int brr[]={7,2,5,4,6,3,5,3};
        MissingNumber missingNumber=new MissingNumber();
        int answer[]=missingNumber.missingNumbers(arr,brr);
        for(int i=0;i<answer.length;i++)
            System.out.println(answer[i]);

    }

    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
        HashMap<Integer,Integer> mapB=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> mapA=new HashMap<Integer,Integer>();
        int bLen=brr.length;
        int aLen=arr.length;
        for(int i=0;i<bLen;i++){
            if(mapB.containsKey(brr[i])){
                mapB.put(brr[i],mapB.get(brr[i])+1);
            }else{
                mapB.put(brr[i],1);
            }
        }
        for(int j=0;j<aLen;j++){
            if(mapA.containsKey(arr[j])){
                mapA.put(arr[j],mapA.get(arr[j])+1);
            }else{
                mapA.put(arr[j],1);
            }
        }
        List<Integer> list=new ArrayList<Integer>();
        for(int element:mapB.keySet()){//we get  elements of brr in this
            if(mapA.containsKey(element)){
                if(mapB.get(element)>mapA.get(element)){
                    list.add(element);
                }
            }else{
                list.add(element);
            }
        }
        Collections.sort(list);
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;

    }



}

