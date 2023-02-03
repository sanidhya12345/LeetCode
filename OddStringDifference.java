/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OddStringDifference {
    public static void main(String[] args) {
        String [] words={"adc","wzy","abc"};
        char [] chars=new char[26];
        for(int i=0;i<26;i++){
            chars[i]=(char)(i+'a');
        }
//        List<List<Integer>> listdifference=new ArrayList<>();
        HashMap<String,List<Integer>> map=new HashMap<>();
        HashMap<List<Integer>,Integer> mp=new HashMap<>();
        for(String i:words){
            int idx1=chars[i.charAt(0)-'a'];
            int idx2=chars[i.charAt(1)-'a'];
            int idx3=chars[i.charAt(2)-'a'];
            List<Integer> al=new ArrayList<>();
            al.add(idx2-idx1);
            al.add(idx3-idx2);
            map.put(i,al);
            if(!mp.containsKey(al)){
                mp.put(al,1);
            }
            else{
                mp.put(al,mp.get(al)+1);
            }
        }
        String ans="";
        for(List<Integer> key:mp.keySet()){
            if(mp.get(key)==1){
                for(String i:map.keySet()){
                    if(map.get(i).containsAll(key)){
                      ans=i;
                      break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
